import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Enter A Number: ");
        num = scanner.nextInt();

        if (num>0){
            System.out.printf("%d is a positive number",num);
        }
        else {
            System.out.printf("%d is a negative number",num);
        }

    }
}
