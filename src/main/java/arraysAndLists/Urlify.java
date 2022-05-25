package arraysAndLists;

//replace all spaces in a string with %20- use a character array so it can be performed in place

public class Urlify {
    
    public static void main(String args[]) {
        char[] charArray = {'H', ' ', 'A', ' ', 'A'};
        charArray = efficientUrlIfy(charArray);
        System.out.println(charArray);
    }

    public static char[] efficientUrlIfy(char[] charArray) {
        //start with editing the string at the end and working forwards so we have an extra buffer at the end to not overwrite stuff
        //in first scan we count the number of blank spaces
        int count = 0;
        int currentSize = charArray.length;
        for (char c : charArray) {
            if(c== ' ') {
                count++;
            }
        }
        //then we triple this number to determine how much room we will need at the end 
        int newSize = count*2 + currentSize;
        //in the second pass, in reverse order, we edit a new array of the correct size
        char[] newArray = new char[newSize];
        for (int i = currentSize-1; i >=0; i--) {
            if(charArray[i] == ' ') {
                newArray[newSize - 1] = '0';
                newArray[newSize - 2] = '2';
                newArray[newSize - 3] = '%';
                newSize = newSize - 3;
            } else {
                newArray[newSize - 1] = charArray[i];
                newSize--;
            } 
        }
        return newArray;
    }
}
