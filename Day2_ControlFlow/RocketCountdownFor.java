package LocalRepo.Day2_ControlFlow;

import java.util.Scanner;
public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }
}

