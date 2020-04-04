import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double length, weight;

        System.out.print("Input Rectangle Length: ");
        length = input.nextDouble();
        System.out.print("Input Rectangle Wight: ");
        weight = input.nextDouble();


        double result = length*weight;
        System.out.print("Area of Rectangle: "+result);

    }
}
