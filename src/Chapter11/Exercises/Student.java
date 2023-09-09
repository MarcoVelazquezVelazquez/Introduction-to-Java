package Chapter11.Exercises;

public class Student extends Person {

    //private final String[] St = {"freshman", "sophomore", "junior", "senior"};
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    protected int status;

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }
}
