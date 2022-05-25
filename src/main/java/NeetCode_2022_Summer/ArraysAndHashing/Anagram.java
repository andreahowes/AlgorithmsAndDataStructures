package NeetCode_2022_Summer.ArraysAndHashing;

import java.util.HashMap;

public class Anagram {

    public static void main (String[] args) {
        String s = "anagram";
        String t = "nagarame";
        boolean myValue = isAnagram(s, t);
        System.out.println(myValue);
    }

    private static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> shash = new HashMap<Character, Integer>();
        HashMap<Character, Integer> thash = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            if(shash.containsKey(c)){
                shash.put(c, shash.get(c)+1);
            } else {
                shash.put(c, 1);
            }
        }
        for (Character c : t.toCharArray()) {
            if(thash.containsKey(c)){
                thash.put(c, thash.get(c)+1);
            } else {
                thash.put(c, 1);
            }
        }
        return shash.equals(thash);
    }
    
}
