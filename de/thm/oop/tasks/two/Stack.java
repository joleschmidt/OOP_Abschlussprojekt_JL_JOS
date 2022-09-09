package de.thm.oop.tasks.two;

import java.util.EmptyStackException;

public class Stack<T> {
    //2. Passen Sie das Interface und Ihre Implementierung so an, dass der Stack einen generi- schen Typ verwendet, d.h. einen Typen der bei der Erzeugung eines Stacks angegeben werden kann.

    private T[] stack;

    /**
     *
     * @return Returns the last added element.
     * @throws EmptyStackException if stack is empty
     */
    public T top() throws EmptyStackException {
        if (stack.length == 0) {
            throw new EmptyStackException();
        }
        return stack[stack.length - 1];
    }
    /**
     * @return Returns and removes the last added element.
     * @throws EmptyStackException if stack is empty.
     */
    public T pop() throws EmptyStackException {
        if (stack.length == 0) {
            throw new EmptyStackException();
        }
        T last = stack[stack.length - 1];
        T[] newStack = (T[]) new Object[stack.length - 1];
        for (int i = 0; i < stack.length - 1; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        return last;
    }

    /**
     * Puts the given element on top of the stack.
     */
    public void push(T e) {
        T[] newStack = (T[]) new Object[stack.length + 1];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        newStack[stack.length] = e;
        stack = newStack;
    }

    /**
     * @return The current number of elements of the stack.
     */
    public T size() {
        return (T) new Integer(stack.length);
    }


    /**
     * @return True if and only if the stack contains no elements.
     */
    public boolean isEmpty() {
        return stack.length == 0;
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
