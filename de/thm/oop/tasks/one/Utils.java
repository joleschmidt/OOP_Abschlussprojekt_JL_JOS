package de.thm.oop.tasks.one;

import java.util.Arrays;

public class Utils {
    //min(int[]) NimmteinebeliebigeAnzahlanZahlenanundgibtdiekleinste dieser Zahlen zuru ̈ck.
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    //max(int[]) Nimmt eine beliebige Anzahl an Zahlen an und gibt die gro ̈ßte dieser Zahlen zuru ̈ck.
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    //abs(int number) Nimmt eine beliebige Zahl and und gibt diese positiv zuru ̈ck. z.B. abs(-4) = 4, abs(4) = 4.
    public static int abs(int number) {
        return number < 0 ? -number : number;
    }

    //swap(T[] array, int a, int b) Nimmt ein Array vom beliebigen Typ an und ver- tauscht die Elemente im Array an Position a und b.
    public static <T> T[] swap(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        return array;
    }

    //reverse(T[] a) Nimm ein Array a = (e1,e2,...,en) mit n Elementen an (wo ei (i ∈ {1,...,n}) die Elemente in a sind) und gibt ein neues Array b = (en,en−1,...,e1) zuru ̈ck, das alle Elemente von a in umgekehrter Reihenfolge entha ̈lt.
    public static <T> T[] reverse(T[] array) {
        T[] reversed = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }

    //contains(T[] a, T e) Nimmt ein Array a und ein Element e an und gibt true zuru ̈ck, wenn und nur wenn e in a auftaucht.
    public static <T> boolean contains(T[] array, T element) {
        for (T t : array) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
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
        System.out.println("swapped generic array on pos " + swapPos1 +" & " + swapPos2 + " is: " + Arrays.toString(swap(genericArr, swapPos1, swapPos2)));
        System.out.println("reversed array is: " + Arrays.toString(reverse(genericArr)));
        System.out.println(isContained + " is contained in array: " + contains(genericArr, isContained));
    }


}
