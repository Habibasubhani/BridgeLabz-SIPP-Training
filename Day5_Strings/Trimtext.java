package LocalRepo.Day5_Strings;
import java.util.Scanner;

public class Trimtext {
    public static int[] trimPoints(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String getTrimmed(String text, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += text.charAt(i);
        }
        return res;
    }

    public static boolean checkSame(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] points = trimPoints(text);
        String custom = getTrimmed(text, points[0], points[1]);
        String builtIn = text.trim();
        System.out.println(checkSame(custom, builtIn));
    }
}
