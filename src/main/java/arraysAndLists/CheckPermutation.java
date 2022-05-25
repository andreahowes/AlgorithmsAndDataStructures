package arraysAndLists;

import java.util.Arrays;
import java.util.HashMap;

public class CheckPermutation {
    //given two strings, write a method to decide if one is a permutation of the other
    public static void main(String args[]) {
        String firstString = "Andrea";
        String secondString = "Andrae";
        // boolean result = permutationCheck(firstString, secondString);
        // System.out.println(result);
        boolean result = moreEfficientPermCheck(firstString, secondString);
        System.out.println(result);
    } 
    
    public static boolean permutationCheck(String firstString, String secondString) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();
        for (int i = 0; i < firstString.length(); i++) {
            if (charCount.get(firstString.charAt(i)) == null) {
                charCount.put(firstString.charAt(i), 1);
            } else {
                charCount.put(firstString.charAt(i), charCount.get(firstString.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < secondString.length(); i++) {
            if (charCount.get(secondString.charAt(i)) == null || charCount.get(secondString.charAt(i)) <= 0) {
                return false;
            } else {
                charCount.put(secondString.charAt(i), charCount.get(secondString.charAt(i)) - 1);
            }
        }

        return true;
    }

    public static boolean moreEfficientPermCheck(String first, String second) {
        //we can assume the second has to use all of the same characters as the first
        //so we can check if they are the same length
        //and then check if the two char arrays, after sorting, match 
        //case matters in this scenario 

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);


        String sortedString1 = new String(firstArray);
        String sortedString2 = new String(secondArray);

        if(sortedString1.length() != sortedString2.length()) {
            return false;
        } else {
            return sortedString1.equals(sortedString2);
        }
    }
}
