import java.util.*;

class SolutionArrayList {
    // DFS helper function
    public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, List<Integer> ans) {
        vis[node] = true;
        ans.add(node);

        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, ans);
            }
        }
    }

    // DFS traversal
    public List<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfs(0, vis, adj, ans);
        return ans;
    }

    // BFS traversal
    public List<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (int it : adj.get(node)) {
                if (!visited[it]) {
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}

public class DFS_BFS {
    // Method to create adjacency list using ArrayList
    public static ArrayList<ArrayList<Integer>> createAdjacencyList(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add edges to adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // For undirected graph
        }
        
        return adj;
    }
    
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
            {0, 1}, {0, 2}, {0, 3},
            {1, 2}, {2, 4}
        };
        
        ArrayList<ArrayList<Integer>> adj = createAdjacencyList(V, edges);
        
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.println(i + ": " + adj.get(i));
        }
        
        SolutionArrayList solution = new SolutionArrayList();
        
        System.out.println("\nDFS Traversal: " + solution.dfsOfGraph(V, adj));
        System.out.println("BFS Traversal: " + solution.bfsOfGraph(V, adj));
    }
}