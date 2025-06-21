package LocalRepo.EXTRAS_built_in_Strings;

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String main = scanner.nextLine();
        System.out.print("Enter the substring to search: ");
        String sub = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        System.out.println("Occurrences: " + count);
    }
}

