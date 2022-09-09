package de.thm.oop.tasks;

import de.thm.oop.tasks.four.User;
import de.thm.oop.tasks.four.user.Employee;
import de.thm.oop.tasks.four.user.Professor;
import de.thm.oop.tasks.four.user.Student;

public class Main {

public static void main(String[] args) {
    User student = new Student("Max", "Mustermann", 1990, 123456, "Informatik");
    User professor = new Professor("Hans", "Müller", 1960, 5000, "Prof. Dr. Mustermann", "Informatik");
    User employee = new Employee("Peter", "Schmidt", 1980, 3000, "Hans Müller", "IT-Support");

    System.out.println(student.getAll());
    System.out.println(professor.getAll());
    System.out.println(employee.getAll());
}
}
