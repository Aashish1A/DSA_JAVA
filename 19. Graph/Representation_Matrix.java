public class Representation_Matrix{
    public static void main(String[] args){
        int n = 3, m = 3; // number of vertices and edges
        int[][] adj = new int[n+1][n+1];

        // ------------ Without Weighted ------------------
        // Define edges as pairs
        int[][] edges = {{1,2}, {2,3}, {1,3}};
        
        // Add all edges to adjacency matrix
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1]; // For directed graph, remove the line adj[v][u] = 1;
            adj[u][v] = 1; // u -> v
            adj[v][u] = 1; // v -> u (for undirected graph) -> For directed graph, remove this line
        }
        
        // ------------- Weighted -------------------
        // Define edges as {source, destination, weight}
        // int[][] edges = {{1,2,5}, {2,3,3}, {1,3,7}};
        
        // Add all edges to adjacency matrix with weights
        /*for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            
            adj[u][v] = weight; // u -> v with weight
            adj[v][u] = weight; // v -> u (for undirected graph) -> For directed graph, remove this line
        }*/

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for(int i=1; i<=n; i++){
            System.out.print(i + ": ");
            for(int j=1; j<=n; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nNeighbors of each vertex:");
        // Print actual neighbors
        for(int i=1; i<=n; i++){
            System.out.print(i + ": ");
            for(int j=1; j<=n; j++){
                if(adj[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        /*System.out.println("\nNeighbors with weights:");
        // Print actual neighbors with weights
        for(int i=1; i<=n; i++){
            System.out.print(i + ": ");
            for(int j=1; j<=n; j++){
                if(adj[i][j] != 0){
                    System.out.print("(" + j + "," + adj[i][j] + ") ");
                }
            }
            System.out.println();
        }*/
    }
}