import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        Random letter = new Random();
        char computerLetter = (char) (letter.nextInt(26) + 'a');

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");

        while (true) {

            int scannerLetter = scanner.nextLine().charAt(0);

            if (computerLetter == scannerLetter) {
                System.out.println("You won");
                break;
            } else if (computerLetter-scannerLetter < 5) {
                System.out.println("Hot");
            } else if (computerLetter-scannerLetter > 5) {
                System.out.println("Cold");
            }

        }

    }
}