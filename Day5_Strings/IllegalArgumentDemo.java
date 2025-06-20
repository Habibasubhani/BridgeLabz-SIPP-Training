package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException() {
        String text = "HelloWorld";
        System.out.println(text.substring(5, 2));
    }

    public static void handleException() {
        try {
            String text = "HelloWorld";
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
