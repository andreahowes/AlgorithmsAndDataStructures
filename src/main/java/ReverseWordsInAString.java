public class ReverseWordsInAString {
    //algorithm to reverse the words in a string (word being defined as anything separated by a space).

    public static void main(String[] args) {
        String input = "Hello to the entire world!";
        System.out.println(reverser(input));
    }

    private static StringBuilder reverser(String input) {
        //first turn string into array
        String[] split = input.split(" ");
        StringBuilder newString = new StringBuilder();
        //add arrays in reverse order to a string using string builder (to avoid creating too many strings)
        for (int i = 0; i < split.length; i++) {
            newString.append(split[split.length - 1 - i] + " ");
        }

        return newString;
    }


}
