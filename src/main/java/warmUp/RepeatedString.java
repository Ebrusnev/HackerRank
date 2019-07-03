package main.java.warmUp;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long aSInS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
 aSInS++;
            }
        }
        long times = n / s.length();
        long newLength = times * s.length();
        long result = times * aSInS;
        long leftover = n - newLength;
        String sub = s.substring(0, (int) leftover);
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) == 'a') {
 result++;
            }
        }
        return result;

    }

}
