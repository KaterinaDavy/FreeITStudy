package lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ������ ���");
        String name = scanner.nextLine();
        System.out.println(isMale(name));
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("������� ���� �������");
        int age = scanner1.nextInt();
        System.out.println(isAges(age));
    }
    private static String isMale(String name) {
        String[] letters = {"�", "�", "�", "�", "�", "�", "�", "�"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "�����������,����� ����������� � ���������������";
        } else {
            return "����������, ����, �������, ����";
        }


    }

    private static String isAges(String age) {
        String[] numbers = {}
    }
}
