package main.java.javaChallenge.medium.Stacks.braces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Braces {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Set<Character> openBraces = new HashSet<>();
        openBraces.add('(');
        openBraces.add('[');
        openBraces.add('{');
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.length() < 1 || !openBraces.contains(input.charAt(0))) {
                System.out.println("false");
                continue;
            }
            Stack<Character> braces = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (openBraces.contains(c) || braces.empty()) {
                    braces.push(c);
                } else {
                    char brace = braces.peek();
                    if ((brace == '{' && c == '}') || (brace == '(' && c == ')') || (brace == '[' && c == ']')) {
                        braces.pop();
                    }
                }
            }
            System.out.println(braces.empty());
        }
    }
}
