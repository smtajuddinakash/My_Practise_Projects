import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double fer, result, cal;
        System.out.print("Fahrenheit: ");
        fer = scanner.nextDouble();
        cal = fer-32;
        result = 0.56*cal;
        System.out.print("Celsius: "+result);

    }
}
