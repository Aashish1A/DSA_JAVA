import java.util.ArrayList;

public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.removeFirst();

        System.out.println("Fruits : "+ fruits);
    }
}