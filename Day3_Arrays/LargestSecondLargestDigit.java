package LocalRepo.Day3_Arrays;

import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // 2. Define array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // 3. Index variable
        int index = 0;

        // 4. Loop to extract digits

