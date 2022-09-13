package de.thm.oop.tasks;

import de.thm.oop.tasks.four.User;
import de.thm.oop.tasks.four.user.Employee;
import de.thm.oop.tasks.four.user.Professor;
import de.thm.oop.tasks.four.user.Student;

import java.util.Arrays;

import static de.thm.oop.tasks.one.Utils.*;

public class Main {

    public static void main(String[] args) {

        //Task 1
        /*
        int[] numbers = {3, 4, 5, 6, 7, 8, 9, 2};
        String[] genericArr = {"p", "b", "i", "z", "h", "c", "d"};
        int positivNr = -3;
        int swapPos1 = 1;
        int swapPos2 = 2;
        String isContained = "b";

        System.out.println("Array1: " + Arrays.toString(numbers));
        System.out.println("min number is: " + min(numbers));
        System.out.println("max number is: " + max(numbers));
        System.out.println(positivNr + " positiv number is: " + abs(positivNr));
        System.out.println("Array2: " + Arrays.toString(genericArr));
        System.out.println("swapped generic array on pos " + swapPos1 + " & " + swapPos2 + " is: " + Arrays.toString(swap(genericArr, swapPos1, swapPos2)));
        System.out.println("reversed array is: " + Arrays.toString(reverse(genericArr)));
        System.out.println(isContained + " is contained in array: " + contains(genericArr, isContained));
        */

        //Task 2: Stack
        de.thm.oop.tasks.two.Stack<Integer> stack = new de.thm.oop.tasks.two.Stack<>();
        stack.push(0);
        System.out.println("Stack: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.top());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack is empty? " + stack.isEmpty());


        //Task 3

        //Task 4
        /*
        User student = new Student("Max", "Mustermann", 1990, 123456, "Informatik");
        User professor = new Professor("Hans", "Müller", 1960, 5000, "Prof. Dr. Mustermann", "Informatik");
        User employee = new Employee("Peter", "Schmidt", 1980, 3000, "Hans Müller", "IT-Support");

        System.out.println(student.getAll());
        System.out.println(professor.getAll());
        System.out.println(employee.getAll());
        */
    }
}
