import java.util.Scanner;

public class VouelConsonenl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char c;
        System.out.println("Enter A word");
        c = input.next().charAt(0);

        if (c=='a'){
            System.out.println("Vowel");
        }
        else if (c=='e'){
            System.out.println("Vowel");
        }
        else if (c=='i'){
            System.out.println("Vowel");
        }
        else if (c=='o'){
            System.out.println("Vowel");
        }
        else if (c=='u'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Conchonent");
        }

    }
}
