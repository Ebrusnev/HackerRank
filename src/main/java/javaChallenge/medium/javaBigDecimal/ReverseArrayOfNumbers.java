package main.java.javaChallenge.medium.javaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayOfNumbers {
    public static void main(String[] args) {

        String[] str = {"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        Arrays.sort(str, 0, 9, Collections.reverseOrder((o1, o2) -> {
            BigDecimal bd1 = new BigDecimal(o1);
            BigDecimal bd2 = new BigDecimal(o2);
            return bd1.compareTo(bd2);
        }));

        for (String s : str) {
            System.out.println(s);
        }

    }
}
