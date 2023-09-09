package Chapter11.Exercises;

import java.util.Calendar;
import java.util.Date;

public class Employee extends Person{

    protected String office;
    protected int salary;
    protected Calendar dateHired;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}
