
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number2: ");
        int num2 = input.nextInt();

        System.out.println("The Quotient is " + (num1 / num2) + " and Remainder is " + (num1 % num2) + " of two numbers " + num1 + " and " + num2);
    }
}
