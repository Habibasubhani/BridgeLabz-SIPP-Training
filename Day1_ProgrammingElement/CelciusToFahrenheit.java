
import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 9/5)+32;
        System.out.println(fahrenheit);
    }
}