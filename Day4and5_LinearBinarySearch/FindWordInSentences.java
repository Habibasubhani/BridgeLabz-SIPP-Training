package LocalRepo.Day4and5_LinearBinarySearch;

import java.util.Scanner;

public class FindWordInSentences {

    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        String result = searchSentence(sentences, word);
        System.out.println("Result: " + result);

        sc.close();
    }
}

