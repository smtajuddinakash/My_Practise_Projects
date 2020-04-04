import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a positive Integer: ");
        num = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i < num; i++){
            if (num%i==0){
                sum++;
                break;
            }
        }
        if (sum==0){
            System.out.println("The Number Is Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
