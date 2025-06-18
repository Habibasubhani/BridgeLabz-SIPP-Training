package LocalRepo.Day4_Methods;

import java.util.Scanner;

public class TriangularParkRun {

    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double requiredDistance = 5000; // in meters
        return (int) Math.ceil(requiredDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }
}

