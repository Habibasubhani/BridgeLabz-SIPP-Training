package LocalRepo.Day2_ProgrammingElement;

import java.util.Scanner;
public class RocketCountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launched!");
    }
}

