import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void HashMapMethods(){

        // Syntax
        HashMap<String, Integer> map = new HashMap<>();

        // Adding Elements
        map.put("Aashish", 19);
        map.put("Aditya", 22);
        map.put("Yash", 17);
        map.put("Harry", 24);
        map.put("Aryan", 25);

        // Getting value of a key from the HashMap
        System.out.println(map.get("Yash"));

        // Changing/updating value of a key in the HashMap014+-
        map.put("Yash", 26);
        System.out.println(map.get("Yash"));

        // Removing a pair from the HashMap
        System.out.println(map.remove("Yash"));

        // Checking if a key is in the HashMap
        System.out.println(map.containsKey("Yash"));
        System.out.println(map.containsKey("Aashish"));

        // Adding a new entry only if the new key doesn't exist already
        map.putIfAbsent("Aashish", 19); // will not enter
        map.putIfAbsent("Akash", 21); // will enter

        // Get all keys in the HashMap
        System.out.println(map.keySet());

        // Get al values in the HashMap
        System.out.println(map.values());

        // Get all the entries in the HashMap
        System.out.println(map.entrySet());

        // Traversing all entries of HashMap - multiple methods
        for(String key : map.keySet()){
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }
        System.out.println("\nAnother way to do it!\n");
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println("\nAnother way to do it!\n");
        for(var e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
            
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}