import java.util.Scanner;

public class LoopDemo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n,m;

        System.out.print("Enter n: ");
        n = scanner.nextInt();
        System.out.print("Enter m: ");
        m = scanner.nextInt();

        for (int i = n; i<=m; i++){
            if (i%2==0){
                sum = sum + i;
                System.out.println(i);
            }

        }
        System.out.println("Sum is: "+sum);
    }
}
