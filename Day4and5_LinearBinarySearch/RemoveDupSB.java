package LocalRepo.Day4and5_LinearBinarySearch;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDupSB {

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}

