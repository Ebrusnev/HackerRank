package main.java.GreedyAlgorythms;

import java.util.Arrays;

public class MinAbsolutDifference {

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i+1] - arr[i];
            if(difference < minDifference) {
 minDifference = difference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, -7};
        System.out.println(minimumAbsoluteDifference(arr));
    }
}
