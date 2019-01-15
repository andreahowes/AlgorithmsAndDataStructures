import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberOfDuplicates {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 1, 2, 3};
        System.out.println(Arrays.toString(deleteNth(elements, 0)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            if (!map.containsKey(elements[i])) {
                map.put(elements[i], 1);
                newList.add(elements[i]);
            } else {
                if (map.get(elements[i]) < maxOccurrences) {
                    newList.add(elements[i]);
                    map.put(elements[i], map.get(elements[i]) + 1);
                }
            }
        }

        int[] newArray = new int[newList.size()];

        for (int x = 0; x < newList.size(); x++) {
            newArray[x] = newList.get(x);
        }
        System.out.println(newArray.length);
        return newArray;
    }
}

