package arraysAndLists;

//return boolean based on if two strings are one edit away (remove character, add character, or replace character)

public class OneAway {


    public static void main(String[] args) {
        String string1 = "andrea";
        String string2 = "andrda";
        boolean result;
        //check method based on if same size or not
        if (string1.length() == string2.length()) {
            result = sameSizeCheck(string1, string2);
        } else if (string1.length() > string2.length()) {
            result = oneAwayCheck(string1, string2);
        } else {
            result = oneAwayCheck(string2, string1);
        }
        System.out.println(result);
    }
    //returns true if same string or off by one
    public static boolean sameSizeCheck(String string1, String string2) {
        int difference = 0;
        for (int i = 0; i < string1.length(); i++) {
            if(string1.toCharArray()[i] != string2.toCharArray()[i]){
                difference++;
            }
        }
        if(difference > 1) {
            return false;
        }
        return true;
    }

    //checks assuming string 1 is the larger one
    public static boolean oneAwayCheck(String string1, String string2) { 
        int index = 0;
        int differences = 0;
        for (int i = 0; i < string2.length(); i++) {
            if(string1.toCharArray()[index] != string2.toCharArray()[i]){
                index++;
                differences++;
            } 
            index++;
        }
        if(differences>1) {
            return false;
        }
        return true;
    }
   
        
    
}
