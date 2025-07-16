package LocalRepo.Day2_StackQueueHashmapHashfunction;

import java.util.*;

public class SlidingWindowMaximum {

    public static void printMaxInWindow(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
          
            while (!dq.isEmpty() && dq.peek() <= i - k)
                dq.poll();

            
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offer(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peek()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Sliding Window Maximums:");
        printMaxInWindow(arr, k);
    }
}

