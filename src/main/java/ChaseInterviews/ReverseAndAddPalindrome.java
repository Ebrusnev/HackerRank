package main.java.ChaseInterviews;

public class ReverseAndAddPalindrome {

    public static void main(String[] args) {
        int i = 128;
        try {
            while (true) {
 i = reverseAndAddInt(i);
 if (isIntPalindrome(i)) {
    System.out.println(i + " is Palindrome!");
    break;
 }
            }
        } catch (Exception e) {
            System.out.println("i cannot be a Palindrome");
        }
    }

    public static int reverseAndAddInt(int i) throws Exception {
        long result = 0;
        long l = i;
        while (l != 0) {
            result = result * 10 + l % 10;
            l /= 10;
        }
        result = result + i;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new Exception();
        }
        return (int) result;
    }

    public static boolean isIntPalindrome(int i) {
        String s = String.valueOf(i);
        for (int j = 0; j < s.length() / 2; j++) {
            if (s.charAt(j) != s.charAt(s.length() - 1)) {
 return false;
            }
        }
        return true;
    }

}
