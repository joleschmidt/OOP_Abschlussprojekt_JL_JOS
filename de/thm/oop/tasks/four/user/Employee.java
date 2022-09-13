package de.thm.oop.tasks.four.user;
import de.thm.oop.tasks.four.User;

public class Employee extends User {
    private int salary;
    private String supervisor;
    private String activityDescription;

    /**
     *
     * @param firstName
     * @param lastName
     * @param birthdate
     * @param salary
     * @param supervisor
     * @param activityDescription
     */
    public Employee(String firstName, String lastName, int birthdate, int salary, String supervisor, String activityDescription) {
        super(firstName, lastName, birthdate);
        this.salary = salary;
        this.supervisor = supervisor;
        this.activityDescription = activityDescription;
    }

    /**
     *
     * @return
     */
    public String getAll() {
        return (firstName + ", " + lastName + ", " + birthdate + ", " + salary + ", " + supervisor + ", " + activityDescription);
    }
}
