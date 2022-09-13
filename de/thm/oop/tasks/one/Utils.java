package de.thm.oop.tasks.one;

import java.util.Arrays;

public class Utils {

    /**
     *min(int[]) Nimmt eine beliebige Anzahl an Zahlen an und gibt diek leinste dieser Zahlen zuruueck.
     *
     * @param numbers
     * @return
     */
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }


    /**
     * max(int[]) Nimmt eine beliebige Anzahl an Zahlen an und gibt die groeßte dieser Zahlen zurueck.
     *
     * @param numbers
     * @return
     */
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * abs(int number) Nimmt eine beliebige Zahl and und gibt diese positiv zurueck. z.B. abs(-4) = 4, abs(4) = 4.
     *
     * @param number
     * @return
     */
    public static int abs(int number) {
        return number < 0 ? -number : number;
    }


    /**
     * swap(T[] array, int a, int b) Nimmt ein Array vom beliebigen Typ an und ver- tauscht die Elemente im Array an Position a und b.
     *
     * @param array
     * @param a
     * @param b
     * @return
     * @param <T>
     */
    public static <T> T[] swap(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        return array;
    }


    /**
     * reverse(T[] a) Nimm ein Array a = (e1,e2,...,en) mit n Elementen an (wo ei (i ∈ {1,...,n}) die Elemente in a sind)
     * und gibt ein neues Array b = (en,en−1,...,e1) zurueck, das alle Elemente von a in umgekehrter Reihenfolge enthaelt.
     *
     * @param array
     * @return
     * @param <T>
     */
    public static <T> T[] reverse(T[] array) {
        T[] reversed = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }


    /**
     *contains(T[] a, T e) Nimmt ein Array a und ein Element e an und gibt true zuruëck, wenn und nur wenn e in a auftaucht.
     *
     * @param array
     * @param element
     * @return
     * @param <T>
     */
    public static <T> boolean contains(T[] array, T element) {
        for (T t : array) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
