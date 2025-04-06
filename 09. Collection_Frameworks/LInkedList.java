import java.util.LinkedList;

public class LInkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.addFirst("Cat");
        animals.addLast("Rabbit");

        System.out.println("Animals: " + animals);
    }
}
