package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class ManualLength {
    public static int getLen(String s) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Manual: " + getLen(text));
        System.out.println("Built-in: " + text.length());
    }
}

