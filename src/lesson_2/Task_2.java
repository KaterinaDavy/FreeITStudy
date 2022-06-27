package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter month number");
        int month = scanner.nextInt();
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println("There is no month with this number");
        }
        System.out.println(isSeason(month));
    }

    private static String isSeason(int month) {
        switch (month) {
            case 1, 2, 12 -> {
                return "Winter";
            }
            case 3, 4, 5 -> {
                return "Spring";
            }
            case 6, 7, 8 -> {
                return "Summer";
            }
            case 9, 10, 11 -> {
                return "Autumn";
            }
            default -> {
                return "There is no month with this number ";
            }
        }
    }

}
