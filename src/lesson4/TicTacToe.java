package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args) {
//        int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < board.length; i++) { //строки
//            for (int j = 0; j < board[i].length; j++) { //элементы строки
//                System.out.print(board[i][j] + " ");

        String [][] board = {{"1", "2", "3"},
                {"4","5","6"},
                {"7","8","9"}};


//        Random computer = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number from 1 to 9");

        String x = "x";
        String o = "o";
        boolean exit = false;

        int i = 0;
        while (!exit) {

            System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2]);
            System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2]);
            System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2]);
            System.out.println("Choose a number from 1 to 9");
            int player = scanner.nextInt();




            switch (player) {
                case 1 -> board[0][0] = x;
                case 2 -> board[0][1] = x;
                case 3 -> board[0][2] = x;
                case 4 -> board[1][0] = x;
                case 5 -> board[1][1] = x;
                case 6 -> board[1][2] = x;
                case 7 -> board[2][0] = x;
                case 8 -> board[2][1] = x;
                case 9 -> board[2][2] = x;

            }
            i++;
            if (i == 5){
                break;
            }


            int computerPlayer = scanner.nextInt();
            switch (computerPlayer) {
                case 1 -> board[0][0] = o;
                case 2 -> board[0][1] = o;
                case 3 -> board[0][2] = o;
                case 4 -> board[1][0] = o;
                case 5 -> board[1][1] = o;
                case 6 -> board[1][2] = o;
                case 7 -> board[2][0] = o;
                case 8 -> board[2][1] = o;
                case 9 -> board[2][2] = o;

            }
              if (board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) ||
                  board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) ||
                      board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) ||
                      board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) ||
                      board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) ||
                      board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) ||
                      board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) ||
                      board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])) {
                  exit= true;
              }
        }
        System.out.println("Cogratulations!!!");
    }
}