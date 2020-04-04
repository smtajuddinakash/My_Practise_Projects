import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int num;

        System.out.println("Enter A Number: ");
        num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("You Enter Number One");
                break;
            case 2:
                System.out.println("You Enter Number Two");
                break;
            case 3:
                System.out.println("You Enter Number Three");
                break;
            case 4:
                System.out.println("You Enter Number Four");
                break;
            case 5:
                System.out.println("You Enter Number Five");
                break;
            case 6:
                System.out.println("You Enter Number Six");
                break;
            case 7:
                System.out.println("You Enter Number Seven");
                break;
            case 8:
                System.out.println("You Enter Number Eight");
                break;
            case 9:
                System.out.println("You Enter Number Nine");
                break;
            case 10:
                System.out.println("You Enter Number Ten");
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }
}
