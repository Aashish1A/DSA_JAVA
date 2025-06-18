import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Apple");
        st.add("Banana");
        st.add("Apple");
        System.out.println(st);
        System.out.println(st.contains("Apple"));
        System.out.println(st.size());
        st.remove("Apple");
        System.out.println(st.contains("Apple"));
        System.out.println(st.size());
        st.add("Cherry");

        for(String s : st){
            System.out.println(s);
        }
    }
}