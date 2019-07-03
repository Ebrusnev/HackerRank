package main.java.warmUp;

public class CloudJumper {

    static int jumpingOnClouds(int[] c) {
        int jumps = -1;
        for (int i = 0; i < c.length; i++) {
            if (i + 2 < c.length && c[i + 2] == 0) {
 i++;
            }
            jumps++;
        }
        return jumps;
    }

}
