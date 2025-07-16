package LocalRepo.Day4and5_LinearBinarySearch;
import java.util.Scanner;

public class ReverseStringSB {

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}

