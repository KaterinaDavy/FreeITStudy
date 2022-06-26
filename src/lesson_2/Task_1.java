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
        System.out.println(isAges(age));
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

    private static String isAges(int age) {
        switch (age) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 -> {
                return "Поздравляю, у вас вся жизнь впереди";
            }
            default -> {
                return "Не расстраиваетесь, возраст -это всего лишь цифры";
            }
        }
    }
}
