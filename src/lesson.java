import java.util.Scanner;

public class lesson {
    //Шахматная ладья ходит по горизонтали или вертикали.
    //Даны две различные клетки шахматной доски, определите,
    //может ли ладья попасть с первой клетки на вторую одним ходом.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2 || y1 == y2) {
            System.out.println("Попадает");
        } else {
            System.out.println("Мимо");
        }
    }
}
