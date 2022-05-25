package arraysAndLists;


/*
For a string, compress it into the letter and the number of times that letter shows up, but only if that is shorter than the original
string
ex) aabbcccaa becomes a2b2c3a2
*/
public class StringCompression {
    public static void main(String[] args) {
        String longString = "aaabbbbbbbbbbffffffffff";
        String compressedString = compressString(longString);
        if(compressedString.length()<longString.length()) {
            System.out.println(compressedString);
        } else {
            System.out.println(longString);
        }

    }
    
    public static String compressString(String string1) {
        //first thing you do is write the current letter to the array and set count to 1
        //move index, if next at index is same, add 1 to count
        //otherwise, write 1 to list and current letter to list and set count to 0
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            
            if(builder.length() > 0) {
                if(string1.toCharArray()[i] != builder.toString().toCharArray()[(builder.length()-1)]){
                    builder.append(String.valueOf(count));
                    builder.append(string1.toCharArray()[i]);
                    count = 1;
                } else {
                    count++;
                }
            } else {
                builder.append(string1.toCharArray()[i]);
                count = 1;
            }
        }
        builder.append(String.valueOf(count));
        return builder.toString();
    }
}
