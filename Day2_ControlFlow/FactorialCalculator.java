package LocalRepo.Day2_ControlFlow;

import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }
}

