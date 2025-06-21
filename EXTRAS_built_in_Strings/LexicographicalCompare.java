package LocalRepo.EXTRAS_built_in_Strings;

import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);
        boolean isEqual = true;

        for (int i = 0; i < minLen; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 < c2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                isEqual = false;
                break;
            } else if (c1 > c2) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            if (len1 < len2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            } else if (len1 > len2) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}

