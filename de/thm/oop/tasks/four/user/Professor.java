package de.thm.oop.tasks.four.user;

import de.thm.oop.tasks.four.User;

public class Professor extends User {
    private int salary;
    private String supervisor;
    private String researchFocus;

    public Professor(String firstName, String lastName, int birthdate, int salary, String supervisor, String researchFocus) {
        super(firstName, lastName, birthdate);
        this.salary = salary;
        this.supervisor = supervisor;
        this.researchFocus = researchFocus;
    }

    public String getAll() {
        return (firstName + ", " + lastName + ", " + birthdate + ", " + salary + ", " + supervisor + ", " + researchFocus);
    }
}
