package LocalRepo.Day4and5_LinearBinarySearch;

import java.util.Scanner;

public class ConcatBuffer {

    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  

        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String result = concatenateStrings(arr);
        System.out.println("Concatenated string: " + result);

        sc.close();
    }
}

