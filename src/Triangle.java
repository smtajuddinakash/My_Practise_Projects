import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, height, result;

        System.out.print("Type Base of Triangle: ");
        base = input.nextDouble();
        System.out.print("Type Height of Triangle: ");
        height = input.nextDouble();

        result = 0.5*base*height;

        System.out.print("Area of Triangle: "+result);

    }
}
