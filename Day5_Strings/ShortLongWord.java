package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class ShortLongWord {
    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int k = 0;
        String w = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') w += c;
            else {
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

    public static int[] findShortLong(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = min;
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static String[][] wordInfo(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] info = wordInfo(words);
        int[] index = findShortLong(info);
        System.out.println("Shortest: " + info[index[0]][0]);
        System.out.println("Longest: " + info[index[1]][0]);
    }
}

