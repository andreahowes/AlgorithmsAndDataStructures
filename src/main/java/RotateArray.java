import java.util.Arrays;

public class RotateArray {
    //for a given array, rotate it to the right by a given key
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 3;
        System.out.println(Arrays.toString(rotateArray(intArray, key)));
    }

    private static Integer[] rotateArray(Integer[] intArray, int key) {
        if (key > intArray.length) {
            key = key % intArray.length;
        }
        Integer[] newArray = new Integer[intArray.length];

        for (int x = 0; x < key; x++) {
            //fill first three slots in new array
            newArray[x] = intArray[intArray.length - key + x];
        }

        int z = 0;
        //fills remaining portion of array
        for (int i = key; i < intArray.length; i++) {
            newArray[i] = intArray[z];
            z++;
        }
        return newArray;
    }
}
