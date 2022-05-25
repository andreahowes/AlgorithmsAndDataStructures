package arraysAndLists;

import java.util.HashMap;

public class PalindromePermutation {

    public static void main(String args[]) {
        String string1 = "aabb";
        System.out.println(checkForPalidrome(string1));

    }

    public static boolean checkForPalidrome(String stringToCheck) {

        //first put it into a hashmap with letter and count of letter
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (char letter : stringToCheck.toCharArray()) {
            if(hashMap.get(letter) == null) {
                hashMap.put(letter, 1);
            } else {
                hashMap.put(letter, hashMap.get(letter) + 1);
            }
        }
        int count = 0;
        for (char letter : stringToCheck.toCharArray()) {
            if(hashMap.get(letter) %2 != 0) {
                count++;
            }
        }
        if(count > 1) {
            return false;
        } 
        return true;
    }
}
