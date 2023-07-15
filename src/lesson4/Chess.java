package lesson4;

public class Chess {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if ((row + column) % 2 == 0) {
                    board[row][column] = "W";
                } else {
                    board[row][column] = "B";
                }
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }
}
