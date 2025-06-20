package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class VoteCheck {
    public static int[] inputAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18 && ages[i] > 0) ? "true" : "false";
        }
        return result;
    }

    public static void display(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = inputAges(10);
        String[][] result = checkVote(ages);
        display(result);
    }
}

