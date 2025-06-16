package LocalRepo.Day2_ControlFlow;

import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean first = a > b && a > c;
        boolean second = b > a && b > c;
        boolean third = c > a && c > b;
        System.out.println("Is the first number the largest? " + first);
        System.out.println("Is the second number the largest? " + second);
        System.out.println("Is the third number the largest? " + third);
    }
}

