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
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            // 6. Check if limit reached
            if (index == maxDigit) {
                break;
            }

            number /= 10;
        }

        // 7. Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // 8. Loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            int current = digits[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // 9. Display result
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (only one unique digit)");
        }
    }
}

