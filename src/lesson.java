import java.util.Scanner;

public class lesson {
    //��������� ����� ����� �� ����������� ��� ���������.
    //���� ��� ��������� ������ ��������� �����, ����������,
    //����� �� ����� ������� � ������ ������ �� ������ ����� �����.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2 || y1 == y2) {
            System.out.println("��������");
        } else {
            System.out.println("����");
        }
    }
}
