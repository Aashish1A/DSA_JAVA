import java.util.LinkedList;

public class ImplementOwnHashmap {

    // Generic HashMap implementation with key type K and value type V
    public static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4; // Default initial capacity
        public static final float DEFAULT_LOAD_FACTOR = 0.75f; // Load factor threshold

        // Node class to store key-value pairs
        private class Node {
            K key;
            V value;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of key-value pairs
        private LinkedList<Node>[] buckets; // Array of buckets

        // Initialize buckets array with N empty linked lists
        @SuppressWarnings("unchecked")
        public void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // Hash function to compute bucket index for a given key
        private int hashFun(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        // Search for a node with the given key in the provided bucket (linked list)
        // Returns the index of the node if found, otherwise -1
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // Constructor: initializes the buckets with default capacity
        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        // Returns the number of key-value pairs in the map
        public int size() {
            return n;
        }

        // Inserts or updates the key-value pair in the map
        public void put(K key, V value) {
            int bi = hashFun(key); // Get bucket index for the key
            LinkedList<Node> currBucket = buckets[bi];

            int idx = searchInBucket(currBucket, key);
            if (idx != -1) {
                // Key exists, update value
                currBucket.get(idx).value = value;
            } else {
                // Key does not exist, add new node
                currBucket.add(new Node(key, value));
                n++;
            }

            // Check load factor and rehash if necessary
            float lambda = (float) n / buckets.length;
            if (lambda > DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        // Retrieves the value associated with the given key, or null if not found
        public V get(K key) {
            int bi = hashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int idx = searchInBucket(currBucket, key);
            if (idx != -1) {
                return currBucket.get(idx).value;
            }
            return null;
        }

        // Removes the key-value pair for the given key and returns its value, or null if not found
        public V remove(K key) {
            int bi = hashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int idx = searchInBucket(currBucket, key);
            if (idx != -1) {
                V val = currBucket.get(idx).value;
                currBucket.remove(idx);
                n--;
                return val;
            }
            return null;
        }

        // Rehashes the hashmap by doubling the number of buckets and reinserting all nodes
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("apple", 2);
        mp.put("banana", 3);
        mp.put("orange", 5);

        System.out.println(mp.get("apple"));   // Output: 2
        System.out.println(mp.get("banana"));  // Output: 3
        System.out.println(mp.get("grape"));   // Output: null

        mp.put("apple", 10); // Update value
        System.out.println(mp.get("apple"));   // Output: 10

        System.out.println(mp.remove("banana")); // Output: 3
        System.out.println(mp.get("banana"));    // Output: null

        System.out.println("Size: " + mp.size()); // Output: Size: 2
    }
}
