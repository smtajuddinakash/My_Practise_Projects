import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radus, area;

        System.out.print("Input Radius: ");
        radus = scanner.nextDouble();

        area = 3.1416 * radus * radus;

        System.out.print("Area of Circle: "+area);

    }
}
