/*public class NQueen {
    static int[] x;

    public static void main(String[] args) {
        int n = 4; // 4x4 board
        x = new int[n];
        NQueenSolver(0, n);
    }

    public static void NQueenSolver(int k, int n) {
        if (k == n) {
            for (int num : x) System.out.print(num + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (place(k, i)) {
                    x[k] = i;
                    NQueenSolver(k + 1, n);
                }
            }
        }
    }

    private static boolean place(int k, int i) {
        for (int j = 0; j < k; j++) {
            if (x[j] == i || Math.abs(x[j] - i) == Math.abs(j - k)) return false;
        }
        return true;
    }
}
*/
import java.util.Arrays;

/**
 * main
 */
public class NQueen {
 static int n=4;
public static void main(String[] args) {
  int board[][]={{0,0,0,0},
                 {0,0,0,0},
                 {0,0,0,0},
                 {0,0,0,0}};
        nQueens(board,0);
        for(int i[]:board){
          for(int j:i){
            System.out.print(j+" ");
          }
          System.out.println();
        }
      
}
private static boolean nQueens(int[][] board, int queen) {
//check if there is a possible pos (left diagonal, right diagonal,
//queen is same col)
  if(queen==n){
      return true;
  }
  for(int row =0;row<n;row++){
    if(isMovePossible(board,row,queen)){
     board[row][queen]=1;
     if(nQueens(board, queen+1)){
      return true;
     }
     board[row][queen]=0;
    }
  }
  return false;
}
private static boolean isMovePossible(int[][] board, int row, int queen) {
  for(int i=0;i<queen;i++){
    if(board[row][i]==1){
      return false;
    }
    
  }//upper diagonal of left
  for(int i=row,j=queen;i>=0 && j>=0;i--,j--){
    if(board[i][j]==1){
      return false;
    }
  }
  // lower to left
  for(int i=row,j=queen;i<n && j>=0;i++,j--){
    if(board[i][j]==1){
      return false;
    }
  }
  return true;
}

}

