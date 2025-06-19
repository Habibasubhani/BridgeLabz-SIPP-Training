package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class CharArrayCompare {
    public static char[] manualCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manual = manualCharArray(text);
        char[] builtIn = text.toCharArray();
        boolean result = compareArrays(manual, builtIn);
        System.out.println("Match: " + result);
    }
}

