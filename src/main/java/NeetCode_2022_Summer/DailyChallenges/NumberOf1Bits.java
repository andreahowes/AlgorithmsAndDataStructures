package NeetCode_2022_Summer.DailyChallenges;

public class NumberOf1Bits {
    
    public static void main(String[] args) {
        int inputInt = 00000000000000000000000000001011;
        int results = numOfBits(inputInt);
        System.out.println(results);
    }

    private static int numOfBits(int inputInt) {
        int count = Integer.bitCount(inputInt);
        return count;
    }

}
