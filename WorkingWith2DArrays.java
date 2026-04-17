import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {

        // Create a 2D board array of characters
        char[][] board = new char[3][3];

        // Loop through array assigning each character a dash
        for (int i = 0; i < 3 ; ++i) {
            for (int j = 0; j < 3 ; ++j) {
                board[i][j] = '-';
            }
        }

        // Assign values to first index of each row
        board[0][0] = '0';
        board[1][0] = 'O';
        board[2][0] = '0';

        // Display the 2D array using deepToString method
        System.out.println("Board 1: " + Arrays.deepToString(board));

        // Create a 2D array of integers using short-hand notation
        char boardTwo[][] = new char[][]{
            new char[]{'0', '-', '-'},
            new char[]{'0', '-', '-'}, 
            new char[]{'0', '-', '-'}
        };

        // Display boardTwo array
        System.out.println("Board 2: " + Arrays.deepToString(boardTwo));
    }
}
