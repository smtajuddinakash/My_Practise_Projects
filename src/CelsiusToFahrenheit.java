import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c, result, plus;

        System.out.print("Input Celsius: ");
        c = scanner.nextDouble();

        result = 1.8*c+32;

        System.out.print("Fahrenheit: "+result);

    }
}
