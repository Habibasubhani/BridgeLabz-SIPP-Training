package LocalRepo.Day2_ControlFlow;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4) || (month == 5)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

