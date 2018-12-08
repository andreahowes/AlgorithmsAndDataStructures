public class Ceasar {
    public static void main(String[] args) {
        String secretMessage = "abcdefghijklmnopqrstuvwxyz";
        Integer key = 3;
        System.out.println(ceasarMethod(secretMessage, key));
    }

    private static StringBuilder ceasarMethod(String secretMessage, Integer key) {
        StringBuilder builder = new StringBuilder();
        char c;
        for (int i = 0; i < secretMessage.length(); i++) {
            c = secretMessage.charAt(i);

            if (Character.isLetter(c)) {
                //if c is a character add the key to it
                c = (char) (secretMessage.charAt(i) + key);
            }
            if ((Character.isLowerCase(secretMessage.charAt(i)) && c > 'z') ||
                    (Character.isUpperCase(secretMessage.charAt(i)) && c > 'Z')) {
                c = (char) (secretMessage.charAt(i) - (26 - key));
            }
            builder.append(c);
        }
        return builder;
    }

}
