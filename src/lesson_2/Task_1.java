package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше полное имя");
        String name = scanner.nextLine();
        System.out.println(isMale(name));
        System.out.println("Введите свой возраст");
        int age = scanner.nextInt();
        if ( age <= 18) {
            System.out.println("Поздравляю, у вас вся жизнь впереди");
        } else {
            System.out.println("Не печальтесь, возраст-это всего лищь цифры");
        };
    }
    private static String isMale(String name) {
        String[] letters = {"а", "у", "е", "о", "э", "я", "и", "ю"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "Приветствую,самая обоятельная и привлекательная";
        } else {
            return "Здравствуй, друг, товарищ, брат";
        }

    }


    }


