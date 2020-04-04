import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter last Number: ");
        int n = input.nextInt();

        for (int i = 1; i <=n; i = i + 1){
            System.out.print(i+" ");
            sum = sum + i * i;
        }
        System.out.print("= "+sum);

    }
}
