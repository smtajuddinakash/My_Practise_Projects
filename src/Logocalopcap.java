import java.util.Scanner;

public class Logocalopcap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char c;
        System.out.printf("Enter A latter: ");
        c = scanner.next().charAt(0);

        if (c>='a'&&c<='z'){
            System.out.println("Small Latter");
        }
        else if (c>='A'&&c<='Z'){
            System.out.println("Big Latter");
        }
        else {
            System.out.println("Invalid latter");
        }


    }
}
