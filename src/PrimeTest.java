import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m,count = 0, totalum = 0;
        System.out.print("Enter Starting Number: ");
        n = scanner.nextInt();
        System.out.print("Enter Ending Number: ");
        m = scanner.nextInt();

        if (n<=1){
            System.out.println("starting 1 is invalid! Please start with 2");
        }
        else {
            for (int i = n; i < m; i++){
                for (int j =2; j <= i-1; j++){
                    if (i%j == 0){
                        count++;
                        break;
                    }

                }
                if (count==0){
                    System.out.println(i);
                    totalum++;

                }
                count=0;
            }
            System.out.println("Total Number: "+totalum);
        }
    }
}
