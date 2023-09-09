package Chapter11.Exercises;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Person: " + name;
    }

    public static void main(String[] args) {
        Person person = new Person("Sócrates");
        Student student = new Student("Platón");
        Employee employee = new Employee("Aristóteles");
        Faculty faculty = new Faculty("Protágoras");
        Staff staff = new Staff("Gorgias");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}