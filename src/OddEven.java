import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int value;
        System.out.print("Enter A positive Number: ");
        value = input.nextInt();

        if (value%2==0){
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number is Odd");
        }
    }
}
