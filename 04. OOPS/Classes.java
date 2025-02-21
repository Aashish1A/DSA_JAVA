public class Classes{

    // --------creating new data types -- classes-----------
    // public static class Student{
    //     String name;
    //     int r_no;
    //     double percentage;
    // }

    public static void data(Student x){
        System.out.println(x.name);
    }

    public static void change(Student s){
        s.name = "ADI";
    }

    public static void main(String[] args) {

        // ------------- objects--------------
        // Student x = new Student(); // declaration
        // x.name = "Aashish"; // Initialization
        // x.r_no = 07;
        // x.percentage = 85;

        // Try to accessing private roll no using getters-------------
        // System.out.println(x.getR_no());

        // Try to set and access the value using setters--------------
        // x.setR_no(07);
        // System.out.println(x.getR_no());
        
        // data(x);
        // change(x);
        // System.out.println(x.name);

        // ------------Accessing value of constructor------------------
        // Student s1 = new Student("Aashish", 07, 85);
        // System.out.println(s1.name);
        // System.out.println(s1.r_no);
        // System.out.println(s1.percentage);

    
        // ------------seeing the use static keyword---------
        
        // System.out.println(Student.getNoOfStudents());

        // Student s1 = new Student("Aashish", 07, 85);
        // System.out.println(s1.getNoOfStudents());

        // Student s2 = new Student("Aniket", 12, 88.9);
        // System.out.println(s2.getNoOfStudents());

        // Student s3 = new Student("ADI", 17, 97.45);
        // System.out.println(s3.getNoOfStudents());
    }
}
