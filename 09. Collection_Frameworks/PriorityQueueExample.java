import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("Head: " + queue.peek());
        queue.poll();
        System.out.println("After removing head: " + queue);
    }
}
