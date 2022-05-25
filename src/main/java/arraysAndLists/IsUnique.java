//test a string for duplicate letters

package arraysAndLists;

public class IsUnique {

    public static void main(String args[]) {
        String testString = "andrea";
        System.out.print(isOnlyUniqueChars(testString));
    }
    
    public static boolean isOnlyUniqueChars(String myString){
        boolean isUnique = true;

        //if longer than 128 return false
        if (myString.length()>128){
            isUnique = false;
            return isUnique;
        }

        //make new array of booleans that match the length of alphabet
        boolean[] myArray = new boolean[128];

        //for each letter, get value at str.charAt(i)
        for (int i = 0; i < myString.length(); i++) {
            int val = myString.charAt(i);
            if (myArray[val]) {
                //if this character is true at the boolean array, return false
                isUnique = false;
                return isUnique;
            } else {
                //if not set it to true
                myArray[val] = true;
            }
        }
        return isUnique;
    }

}
