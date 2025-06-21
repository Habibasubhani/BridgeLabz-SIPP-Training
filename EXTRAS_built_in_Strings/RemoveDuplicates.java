package LocalRepo.EXTRAS_built_in_Strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; 

        for (char ch : input.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

