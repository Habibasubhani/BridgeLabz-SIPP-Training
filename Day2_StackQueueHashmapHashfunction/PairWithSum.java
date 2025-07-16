package LocalRepo.Day2_StackQueueHashmapHashfunction;

import java.util.*;

public class PairWithSum {
    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair found: " + num + " and " + (target - num));
                return true;
            }
            set.add(num);
        }
        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        hasPair(arr, target);
    }
}

