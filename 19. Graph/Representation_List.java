import java.util.ArrayList;

// Pair class to store destination and weight
class Pair {
    int destination;
    int weight;

    Pair(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + destination + "," + weight + ")";
    }
}

public class Representation_List {
    public static void main(String[] args) {
        int n = 3, m = 3; // number of vertices and edges

        // ------------ Unweighted Graph ----------------
        ArrayList<ArrayList<Integer>> adjUnweighted = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjUnweighted.add(new ArrayList<>());
        }

        int[][] edges = { { 1, 2 }, { 2, 3 }, { 1, 3 } };
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjUnweighted.get(u).add(v);
            adjUnweighted.get(v).add(u); // For undirected graph
        }

        System.out.println("Unweighted Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjUnweighted.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // ------------ Weighted Graph ----------------
        ArrayList<ArrayList<Pair>> adjWeighted = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjWeighted.add(new ArrayList<>());
        }

        // Define weighted edges as {source, destination, weight}
        int[][] weightedEdges = { { 1, 2, 5 }, { 2, 3, 3 }, { 1, 3, 7 } };

        for (int[] edge : weightedEdges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            adjWeighted.get(u).add(new Pair(v, weight)); // u -> v with weight
            adjWeighted.get(v).add(new Pair(u, weight)); // v -> u (for undirected graph)
        }

        System.out.println("\nWeighted Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (Pair neighbor : adjWeighted.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
