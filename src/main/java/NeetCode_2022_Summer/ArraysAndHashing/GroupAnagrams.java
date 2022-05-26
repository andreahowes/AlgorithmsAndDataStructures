package NeetCode_2022_Summer.ArraysAndHashing;

import java.util.*;
import java.util.HashMap;

// Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
public class GroupAnagrams {
    
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> results = groupAnagram(strs);
        // System.out.println(results);
    }

    private static List<List<String>> groupAnagram(String[] strs) {

        //create a hashmap that is first an array of 26 that represents how many times each letter is used
        HashMap<int[], ArrayList<String>> answerHash = new HashMap<>();
        for (String word : strs) {
            //create array of 26 counting where in alphabet letters are
            int[] strArray = createAlphabetArray(word);
            // System.out.println(answerHash.get(strArray));
            // System.out.println(word);
            if(answerHash.containsKey(strArray)){ //if already one of the arrays
                // System.out.println("Andrea");
                ArrayList<String> listToUpdate = answerHash.get(strArray);
                listToUpdate.add(word);
                answerHash.put(strArray, listToUpdate);
            } else {
                //put it in the hash as a new key/value
                ArrayList<String> newArray = new ArrayList<>();
                newArray.add(word);
                answerHash.put(strArray, newArray);
                System.out.println(answerHash.get(strArray));
                System.out.println("Why is this triggered?");

            }
        }
        
        //then return all the values from the hashmap in one array
        ArrayList<List<String>> answerToReturn = new ArrayList<>();
        for (int[] wordArray : answerHash.keySet()) {
            answerToReturn.add(answerHash.get(wordArray));
        }
        return answerToReturn;
    }

    private static int[] createAlphabetArray(String word) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, Integer> alphabetHashmap = new HashMap<>();
        //create hashmap with each letter as key and 0 as value
        for (char c : alphabet) {
            alphabetHashmap.put(c, 0);
        }
        //for each letter in word, itterate up once
        for (char a : word.toCharArray()) {
            alphabetHashmap.put(a, alphabetHashmap.get(a) + 1);
        }
        //turn hashmap into an array of only the letters in that specific order
        int[] finalLetterCount = new int[26]; 
        int x = 0;
        for (char letter : alphabet) {
            finalLetterCount[x] = alphabetHashmap.get(letter);
            x++;
        }
        return finalLetterCount;
    }

}
