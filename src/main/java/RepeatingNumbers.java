// import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashMap;

public class RepeatingNumbers {

    //you are given an array of repeating numbers. each number repeats in an even way except one- find that number
    //store all numbers in a hashmap as the key with the value increasing one for each value
    public static void main(String[] args) {
        int[] myArray = {1, 2, 6, 2, 1};
        System.out.println(repeatingNumber(myArray));

    }

    public static int repeatingNumber(int[] myArray) {
        //create hashmap for storing array information
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i : myArray) {
            if (myMap.containsKey(i)) {
                //if int is a key, add one to value in hashmap
                myMap.put(i, myMap.get(i) + 1);
            } else {
                //if int isn't a key, add 1 as value to hashmap
                myMap.put(i, 1);
            }
        }
        //then return a key whose value is odd
        for (Integer x : myMap.keySet()) {
            if (myMap.get(x) % 2 != 0) {
                return x;
            }
        }
        return -1;
    }
}
