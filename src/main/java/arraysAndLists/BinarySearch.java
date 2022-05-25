package arraysAndLists;

public class BinarySearch {

    public static void main(String args[]) {
        BinarySearch binarySearch = new BinarySearch();
        int[] myArray = {5};
        System.out.println(binarySearch.search(myArray, 5));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;  //int m = l + (r - l) / 2;
        while (right>=left) {
            mid = left + (right-left)/2;

            if(nums[mid] == target ) {
                return mid;
            } else if (nums[mid]> target) {

                right = mid - 1;
            } else {

                left = mid + 1;
            }
         }
        return -1;
    }
}
