import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        Random letter = new Random();
        char computerLetter = (char) (letter.nextInt(26) + 'a');
//        int computerLetter = letter.nextInt(26);
//        char ch=
//        System.out.println(computerLetter);
//        System.out.println("Enter a letter");
////
////
////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        String name = scanner.nextLine();
//        boolean exit = false;
//        while (!exit) {
//
//            int scannerLetter = scanner.nextLine().charAt(0);
//
//            if (computerLetter == scannerLetter) {
//                System.out.println("Win");
//            } else if (computerLetter-scannerLetter < 5)
//                System.out.println("Hot");
//        }

//        while (true){
//            String myAnswer = letter.nextLine();
//            char myLetter = myAnswer.charAt(0);
//            int codeLetter = myLetter;
//
////        while (true) {
////            c = scanner.nextInt();
////            if(letter == c) {
////                System.out.println("Yes");
////                break;
////        for (int i =0; (char) System.in.read() != )
//
//            }
//        }
//
//
//////        char random = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
////        char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
//
//
//
//
    }
}