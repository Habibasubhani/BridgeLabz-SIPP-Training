package LocalRepo.Day4_Methods;

import java.util.Scanner;

public class ChocolateDivison {

    public static int[] findRemainderAndQuotient(int totalChocolates, int children) {
        return new int[]{totalChocolates / children, totalChocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}

