import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SymmetricDifference {
    public static void main(String[] args) {
        //Find the Symmetric Difference and return them as an array
        Integer[] firstArray = {2, 2, 3, 4, 5};
        Integer[] secondArray = {2, 4, 6, 8, 10};
        SymmetricDifference.getSymmetricDifference(firstArray, secondArray);
    }

    public static void getSymmetricDifference(Integer[] firstArray, Integer[] secondArray) {
        Set<Integer> symmDiff = new HashSet<Integer>(Arrays.asList(firstArray));
        //this hashset contains all of both arrays
        symmDiff.addAll(Arrays.asList((secondArray)));

        Set<Integer> temp = new HashSet<Integer>(Arrays.asList(firstArray));
        //temp contains only the intersection
        temp.retainAll(Arrays.asList(secondArray));

        symmDiff.removeAll(temp);
        System.out.println(symmDiff);
    }
}
