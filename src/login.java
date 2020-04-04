import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String user ="admin";
        int pass = 123;

        String uinput;
        int pinput;

        System.out.print("Enter User ID: ");
        uinput = scanner.nextLine();
        System.out.print("Enter Pass: ");
        pinput = scanner.nextInt();

        if (uinput.equals(user) && pinput == pass){
            System.out.println("Success Login");
        }
        else if (uinput.equals(user)){
            System.out.println("Password Incorrect");
        }
        else if (pinput != pass){
            System.out.println("User Is Incorrect");
        }
        else {
            System.out.println("Password And User id Incorrect");
        }

    }
}
