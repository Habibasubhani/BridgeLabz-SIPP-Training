package LocalRepo.Day3_Arrays;

import java.util.Scanner;

public class DigitAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Prepare an array to store digits
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Step 3: Extract digits and store in the array
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            // Step 4: Stop if maxDigits reached
            if (index == maxDigits) {
                break;
            }

            number /= 10;
        }

        // Step 5: Find the largest and second largest digit
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int current = digits[i];

            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // Step 6: Display results
        System.out.println("Largest digit: " + largest);

        if (secondLargest == -1) {
            System.out.println("Second largest digit not found.");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        scanner.close();
    }
}

