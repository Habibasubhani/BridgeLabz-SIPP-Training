package LocalRepo.EXTRAS_built_in_Strings;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] freq = new int[256];
        for (char c : input.toCharArray()) {
            freq[c]++;
        }

        char mostFrequent = 0;
        int max = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}

