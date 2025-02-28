public class _73Nqueens {
    public static boolean issafe(char board[][],int row, int col){
        //vertical
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0 ;i-- , j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length ;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][], int row){
        if(row==board.length){
            printer(board);
            count++;
            return;
        }
        for(int j = 0; j<board.length;j++){
            if(issafe(board,row,j)==true){ 
                board[row][j]='Q';
                nqueens(board,row+1);
                board[row][j]='x';
            }
        }
    } 
    public static void printer(char board[][]){
        System.out.println("-------BOARD-------");
        for(int i = 0 ; i<board.length;i++){
            for(int j = 0 ; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
        System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<n;j++){
                board[i][j]='x';
            }
        }
        nqueens(board,0);
        System.out.println("Total number of ways : " + count);
    }
}
