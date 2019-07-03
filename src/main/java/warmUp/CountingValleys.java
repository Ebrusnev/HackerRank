package main.java.warmUp;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int level = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'D') {
 level--;
            }
            if (c == 'U') {
 level++;
 if (level == 0) {
    count++;
 }
            }
        }
        return count;
    }


}
