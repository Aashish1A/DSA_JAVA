import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Math", 95);
        scores.put("English", 90);
        scores.put("Science", 85);

        System.out.println("Scores (sorted by subject): " + scores);
    }
}
