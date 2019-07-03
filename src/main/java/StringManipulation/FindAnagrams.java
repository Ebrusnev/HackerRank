package main.java.StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class FindAnagrams {

    static int makeAnagram(String a, String b) {
        Map<Character, Integer> maxMap = new HashMap<>();
        Map<Character, Integer> minMap = new HashMap<>();
        String min = a.length() <= b.length() ? a : b;
        String max = b.length() >= a.length() ? b : a;

        for (Character c : max.toCharArray()) {
            int i = 0;
            if (maxMap.containsKey(c)) {
 i = maxMap.get(c);
            }
            maxMap.put(c, ++i);
        }
        for (Character c : min.toCharArray()) {
            int i = 0;
            if (minMap.containsKey(c)) {
 i = minMap.get(c);
            }
            minMap.put(c, ++i);
        }
        int result = 0;
        for (Map.Entry<Character, Integer> entry : minMap.entrySet()) {
            char c = entry.getKey();
            if (maxMap.containsKey(c)) {
 maxMap.put(c, maxMap.get(c) - entry.getValue());
            }
            else {
 result += Math.abs(entry.getValue());
            }
        }
        for (Map.Entry<Character, Integer> entry : maxMap.entrySet()) {
            result += Math.abs(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

}
