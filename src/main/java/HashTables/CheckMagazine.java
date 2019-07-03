package main.java.HashTables;

import java.util.HashMap;
import java.util.Map;

public class CheckMagazine {
    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : magazine) {
            int count = 0;
            if (map.containsKey(s)) {
 count = map.get(s);
            }
            map.put(s, ++count);
        }
        for (String s : note) {
            if (map.containsKey(s) && map.get(s) > 0) {
 int i = map.get(s) - 1;
 map.put(s, i);
            } else {
 System.out.println("No");
 return;
            }
        }
        System.out.println("Yes");

    }
}
