package LocalRepo.Day4and5_LinearBinarySearch;

import java.util.Scanner;

public class FindRotationPoint {

    public static int findRotationIndex(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotationIndex = findRotationIndex(arr);
        System.out.println("Rotation point index (smallest element) is at: " + rotationIndex);
        System.out.println("Smallest element is: " + arr[rotationIndex]);

        sc.close();
    }
}

