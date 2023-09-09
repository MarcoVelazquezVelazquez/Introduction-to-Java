package Chapter11.Exercises;

public class Staff extends Employee{
    protected String title;
    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}
