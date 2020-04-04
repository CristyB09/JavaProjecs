
public class Week7Arrays3 {

    static char[][] board = new char[3][3];
    static char[][] board2 = {{'X', 'X', 'X'}, {'O', 'O', 'O'}, {'X', 'X', 'X'}};// this is for the draw

    public static void main(String[] args) {
        for (int i = 0; i < board.length; i++) {//rows

            for (int j = 0; j < board.length; j++) {//colums
                System.out.println(board2[i][j]);
            }
            System.out.println();
        }

    }//main method

}//class
