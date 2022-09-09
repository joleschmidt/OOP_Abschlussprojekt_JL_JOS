package de.thm.oop.tasks.four.user;
import de.thm.oop.tasks.four.User;

public class Student extends User {
    private int matNr;
    private String course;

    public Student(String firstName, String lastName, int birthdate, int matNr, String course) {
        super(firstName, lastName, birthdate);
        this.matNr = matNr;
        this.course = course;
    }

    public String getAll() {
        return (firstName + " " + lastName + " " + birthdate + " " + matNr + " " + course);
    }

}
