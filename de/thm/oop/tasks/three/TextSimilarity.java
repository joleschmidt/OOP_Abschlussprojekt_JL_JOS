package de.thm.oop.tasks.three;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class TextSimilarity {

    /**
     * this function shows dialogs for the process of the dice-coefficient calculation
     */
    public static void inputStrings() {
        Set<String> set = new HashSet<>();

        int n = 2;

        while (true) {
            int dialogResult = JOptionPane.showConfirmDialog(
                    null,
                    "Would you like to calculate the dice-coefficient of two texts?",
                    "Question",
                    JOptionPane.YES_NO_OPTION);
            if (dialogResult != JOptionPane.YES_OPTION){
                break;
            }
            String input1s = JOptionPane.showInputDialog("Please enter first text");
            String input2s = JOptionPane.showInputDialog("Please enter second text");

            Set<String> nT1 = nGramm(input1s, n);
            Set<String> nT2 = nGramm(input2s, n);

            System.out.println(nT1);
            System.out.println(nT2);

            System.out.println(calcDice(nT1, nT2));

            JOptionPane.showMessageDialog(null, "The dice-coefficient is: " + calcDice(nT1,nT2));
        }
    }


    /**
     * @param s string
     * @param n int
     * @return returns thwo sets of the 2-Gramm operation
     */
    public static Set<String> nGramm(String s, int n) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i <= s.length()-n; i++) {
            String a = s.substring(i, i+n);
            set.add(a);
        }
        return set;
    }

    /**
     * @param nT1 the set of the first text
     * @param nT2 the set of the second text
     * @return returns the calculated dice-coefficient as a double
     */
    public static double calcDice(Set<String> nT1, Set<String> nT2){
        Set<String> t = new HashSet<>(nT1);
        t.retainAll(nT2);
        return  2 * (double)t.size()/(double)(nT1.size() + nT2.size()) ;
    }
}
