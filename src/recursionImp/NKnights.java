package recursionImp;

public class NKnights {

    static void Knight(boolean[][] board, int row, int col , int knights){

        if (knights == 0){
            display(board);
            return;
        }

        if(row == board.length - 1 && col == board.length){
            return;
        }

        if(col == board.length) {
            Knight(board,row + 1,0,knights);
            return;
        }

        if (isSafe(board,row,col)){
            board[row][col] = true;
            Knight(board,row,col + 1,knights - 1);
            board[row][col] = false;
        }

        Knight(board,row,col+1,knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        if (isvalid(board,row - 2,col - 1)){
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isvalid(board,row - 1,col - 2)){
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isvalid(board,row - 2,col + 1)){
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isvalid(board,row - 1,col + 2)){
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    static boolean isvalid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >=0 && col < board.length){
            return true;
        }

        return false;
    }

    private static void display(boolean[][] board){
        for (boolean[] row: board){
            for (boolean element: row){
                if(element) {
                    System.out.print("K");
                }
                else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

}
