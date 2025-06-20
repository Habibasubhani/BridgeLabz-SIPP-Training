package LocalRepo.Day5_Strings;

import java.util.Scanner;

public class ArrayIndexCheck {
    public static void throwException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void catchException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        } catch (Exception e) {
            System.out.println("runtime error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }
        catchException(names);
    }
}
