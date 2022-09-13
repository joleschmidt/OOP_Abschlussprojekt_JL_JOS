package de.thm.oop.tasks.two;

import java.util.EmptyStackException;

public class Stack<T> {
    private T[] stack = (T[]) new Object[0];
    /**
     *
     * @return Returns the last added element.
     * @throws EmptyStackException if stack is empty
     */
    public T top(){
        if(stack.length == 0){
            throw new EmptyStackException();
        }
        return stack[stack.length - 1];
    }
    /**
     * @return Returns and removes the last added element.
     * @throws EmptyStackException if stack is empty.
     */
    public T pop() {
        if(stack.length == 0){
            throw new EmptyStackException();
        }
        T last = stack[stack.length - 1];
        T[] newStack = (T[]) new Object[stack.length - 1];
        for(int i = 0; i < stack.length - 1; i++){
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
        for(int i = 0; i < stack.length; i++){
            newStack[i] = stack[i];
        }
        newStack[newStack.length - 1] = e;
        stack = newStack;
    }

    /**
     * @return The current number of elements of the stack.
     */
    public T size(){
        return (T) Integer.valueOf(stack.length);
    }

    /**
     * @return True if and only if the stack contains no elements.
     */
    public boolean isEmpty() {
        return stack.length == 0;
    }
}
