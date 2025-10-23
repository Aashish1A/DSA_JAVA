import java.util.*;

public class sourceToDestination {
    class Pair {
        int distance;
        int node;

        Pair(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

    class Solution {
        public int[] shortestPath(int[][] edges, int N, int M) {
            // Step 1: Create graph
            List<List<Pair>> adj = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < M; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
                int w = edges[i][2];
                adj.get(u).add(new Pair(w, v));
                adj.get(v).add(new Pair(w, u));
            }

            // Step 2: Dijkstra's algorithm
            PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
            int[] dist = new int[N + 1];
            int[] parent = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                dist[i] = (int) (1e9);
                parent[i] = i;
            }

            dist[1] = 0;
            pq.add(new Pair(0, 1));

            while (!pq.isEmpty()) {
                Pair curr = pq.poll();
                int currDist = curr.distance;
                int node = curr.node;

                for (Pair it : adj.get(node)) {
                    int adjNode = it.node;
                    int edgeWeight = it.distance;

                    if (currDist + edgeWeight < dist[adjNode]) {
                        dist[adjNode] = currDist + edgeWeight;
                        pq.add(new Pair(dist[adjNode], adjNode));
                        parent[adjNode] = node;
                    }
                }
            }

            // Step 3: Reconstruct path
            if (dist[N] == (int) (1e9)) {
                return new int[] { -1 };
            }

            List<Integer> path = new ArrayList<>();
            int node = N;
            while (parent[node] != node) {
                path.add(node);
                node = parent[node];
            }
            path.add(1);
            Collections.reverse(path);

            int[] ansPath = new int[path.size()];
            for (int i = 0; i < path.size(); i++) {
                ansPath[i] = path.get(i);
            }

            return ansPath;
        }
    }

    public static void main(String[] args) {
        sourceToDestination obj = new sourceToDestination();
        Solution solution = obj.new Solution();

        // Test Case
        int N = 5, M = 6;
        int[][] edges = {
            {1, 2, 2}, {2, 5, 5}, {2, 3, 4},
            {1, 4, 1}, {4, 3, 3}, {3, 5, 1}
        };

        int[] result = solution.shortestPath(edges, N, M);
        
        System.out.print("Shortest Path: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(" -> ");
        }
    }
}