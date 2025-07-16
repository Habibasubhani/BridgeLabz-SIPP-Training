package LocalRepo.Day2_StackQueueHashmapHashfunction;

import java.util.Stack;

public class SortStackRecursive {

    public static void sortedInsert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
        } else {
            int temp = stack.pop();
            sortedInsert(stack, x);
            stack.push(temp);
        }
    }

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sortStack(stack);
            sortedInsert(stack, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

