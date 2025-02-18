public class Q1 {
    public static void main(String[] args) {
        int[] marks = {35, 42, 33, 45, 22, 56, 23};
        for(int i=0; i<marks.length; i++){
            if(marks[i] <  35){
                System.out.print(i + " ");
            }
        }
    }
}
