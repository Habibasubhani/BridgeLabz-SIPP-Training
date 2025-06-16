package LocalRepo.Day2_ControlFlow;

import java.util.Scanner;
public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            int i = 1;
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }
}

