package LocalRepo.Day2_ControlFlow;

import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num = sc.nextDouble();
        while (num != 0) {
            total = total + num;
            num = sc.nextDouble();
        }
        System.out.println("Total sum is " + total);
    }
}
