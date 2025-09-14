import java.util.*;

class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k; value = v;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail; // dummy head & tail

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        
        // Initialize dummy head and tail
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        
        Node node = map.get(key);
        remove(node);
        insertToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertToHead(node);
        } else {
            if (map.size() == capacity) {
                // Remove least recently used (from tail.prev)
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertToHead(newNode);
        }
    }

    // Helper: remove node from linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Helper: insert node right after head (most recent)
    private void insertToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lruCache.get(1)); // return 1
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lruCache.get(2)); // returns -1 (not found)
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lruCache.get(1)); // return -1 (not found)
        System.out.println(lruCache.get(3)); // return 3
        System.out.println(lruCache.get(4)); // return 4
    }
}