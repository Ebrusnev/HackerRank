package main.java.warmUp;

import java.util.HashMap;
import java.util.Map;

public class SocksMerchant {

    static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> socks = new HashMap<>();
        for (int i : ar) {
            int count = 0;
            if (socks.containsKey(i)) {
 count = socks.get(i);
            }
            socks.put(i, ++count);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : socks.entrySet()) {
            result += entry.getValue() / 2;
        }
        return result;

    }

}
