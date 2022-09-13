package de.thm.oop.tasks.four;

public class User {
    public String firstName;
    public String lastName;
    public int birthdate;


    /**
     *
     * @param firstName
     * @param lastName
     * @param birthdate
     */
    public User(String firstName, String lastName, int birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    /**
     *
     * @return
     */
    public String getAll() {
        return (firstName + ", " + lastName + ", " + birthdate);
    }
}
