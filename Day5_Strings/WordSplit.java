package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class WordSplit {
    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int k = 0;
        String w = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                if (!w.equals("")) {
                    words[k++] = w;
                    w = "";
                }
            }
        }
        if (!w.equals("")) words[k++] = w;
        String[] res = new String[k];
        for (int i = 0; i < k; i++) res[i] = words[i];
        return res;
    }

    public static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    public static String[][] wordInfo(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void show(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + Integer.parseInt(arr[i][1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = wordInfo(words);
        show(result);
    }
}
