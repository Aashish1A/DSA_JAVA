public class Student {
    String name;
    int r_no;
    double percentage;

    private static int noOfStudent;

    // -------------COnstructor----------

    // default constructor
    public Student() {

    }

    // Parameterized Constructor
    public Student(String name, int roll, double percentage) {
        this.name = name;
        this.r_no = roll;
        this.percentage = percentage;
        noOfStudent++;
    }

    // Getter function
    public int getR_no() {
        return r_no;
    }

    public static int getNoOfStudents(){
        return noOfStudent;
    }

    // setter function
    public void setR_no(int r_no) {
        this.r_no = r_no;
    }
}
