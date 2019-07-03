package main.java.Arrays;

public class LeftRotation {

    public static int[] rotateLeft(int[] a, int d) {

        int index = 0;
        int aLength = a.length - 1;

        for (int i = 0; i < d; i++) {
            if (aLength < 0) {
 aLength = a.length - 1;
            }
            index = aLength--;
        }
        int[] result = new int[a.length];
        for (int value : a) {
            if (index >= a.length) {
 index = 0;
            }
            result[index++] = value;
        }
        return result;
    }

}
