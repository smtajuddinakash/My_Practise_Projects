import java.util.Scanner;

public class Gunernamta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum;
        System.out.print("Enter A number: ");
        sum = scanner.nextInt();

        for (int i = 1; i<=10; i++) {

            System.out.println(sum+" X "+i+" = "+sum*i);

        }
    }
}
