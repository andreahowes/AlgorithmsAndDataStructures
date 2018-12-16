public class BinarySearch {

    //Search a sorted array by repeatedly dividing the search interval in half. Return the index of the int if it is in the array.

    public static void main(String[] args) {
        //creation of the sorted array
        int[] myArray = new int[50];

        //filling array
        for (int i = 0; i < 50; i++) {
            myArray[i] = (i + 1);
        }

        int IntToSearchFor = 33;

        binarySearch(myArray, IntToSearchFor, myArray.length - 1, 0);

    }

    private static void binarySearch(int[] myArray, int intToSearchFor, int rightBoundary, int leftBoundary) {
        if (rightBoundary >= 1 && leftBoundary<=myArray.length) {
            int middleOfArray = myArray[(rightBoundary + leftBoundary-1 ) / 2];
            System.out.println(middleOfArray);
            if (intToSearchFor == middleOfArray) {
                System.out.println("The index of the missing number is: " + middleOfArray);

            } else if (intToSearchFor > middleOfArray) {
                //shift search to right half of array
                binarySearch(myArray, intToSearchFor, rightBoundary, middleOfArray + 1);

            } else {
                //shift search to left half of array
                binarySearch(myArray, intToSearchFor, middleOfArray - 1, leftBoundary);
            }
        } else {
            System.out.println("The number isn't in the array");
        }
    }
}
