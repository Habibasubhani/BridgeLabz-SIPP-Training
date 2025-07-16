package LocalRepo.Day4and5_LinearBinarySearch;

import java.util.Scanner;

public class FindPeakElement {

    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            boolean leftGreater = mid > 0 && arr[mid] < arr[mid - 1];
            boolean rightGreater = mid < arr.length - 1 && arr[mid] < arr[mid + 1];

            if (!leftGreater && !rightGreater) {
                return arr[mid];
            } else if (leftGreater) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = findPeak(arr);
        System.out.println("A peak element is: " + peak);

        sc.close();
    }
}
