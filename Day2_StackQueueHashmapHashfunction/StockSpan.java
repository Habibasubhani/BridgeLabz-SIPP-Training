package LocalRepo.Day2_StackQueueHashmapHashfunction;

import java.util.Stack;

public class StockSpan {
    public static void calculateSpan(int[] price, int n, int[] span) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[i] >= price[stack.peek()])
                stack.pop();

            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = new int[n];
        calculateSpan(price, n, span);

        System.out.println("Stock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

