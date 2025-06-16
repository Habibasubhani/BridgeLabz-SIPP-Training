package LocalRepo.Day2_ControlFlow;
import java.util.Scanner;
public class SumNaturalWithComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formula);
            System.out.println("Both are same? " + (sum == formula));
        } else {
            System.out.println("Not a natural number");
        }
    }
}

