public class String_Builder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        str.append("World"); // add one more string in existing string
        System.out.println(str);

        str.setCharAt(0, 'M'); // changing character at index no
        System.out.println(str);

        str.insert(0, "J"); // insert string at index 
        System.out.println(str);

        str.deleteCharAt(10); // deleting character using indexing
        System.out.println(str);

        StringBuilder s = new StringBuilder("Hello");
        s.reverse();
        System.out.println(s);
    }
}
