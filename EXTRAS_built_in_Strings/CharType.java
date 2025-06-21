package LocalRepo.EXTRAS_built_in_Strings;

import java.util.Scanner;

public class CharType {
    public static String getType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if ("aeiou".indexOf(ch) != -1) return "Vowel";
        if (ch >= 'a' && ch <= 'z') return "Consonant";
        return "Not a Letter";
    }

    public static String[][] analyze(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = getType(text.charAt(i));
        }
        return result;
    }

    public static void show(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " - " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = analyze(text);
        show(result);
    }
}

