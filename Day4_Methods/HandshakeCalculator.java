package LocalRepo.Day4_Methods;

import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int totalHandshakes = calculateHandshakes(students);
        System.out.println("Maximum handshakes possible: " + totalHandshakes);
    }
}

