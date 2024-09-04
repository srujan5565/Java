/**
 * main
 */
public class sudoku_solver {
    static int n=4;
     public static void main(String[] args) {
      int puzzle[][]={{1,0,0,0},
                      {0,2,0,0},
                      {0,0,3,0},
                      {0,0,0,4}};
      SolvePuzzle(puzzle);
      for(int i[]:puzzle){
        for(int j:i){
          System.out.print(j+" ");
        }
        System.out.println();
      }
     }
    private static boolean SolvePuzzle(int[][] puzzle) {
      int posRow=-1,posCol=-1;
      boolean isEmpty=false;
      for(int row=0;row<n;row++){
        for(int col=0;col<n;col++){
          if(puzzle[row][col]==0){
              posRow=row;//0
              posCol=col;//2
              isEmpty=true;
              break;
             }
          }
        }
        if(!isEmpty){
          return true;
        }
        for(int num=1;num<=n;num++){
        
          if(isNumPossible(puzzle,posRow,posCol,num)){
            puzzle[posRow][posCol]=num;
            if(SolvePuzzle(puzzle)){
              return true;
            }
            puzzle[posRow][posCol]=0;
          }
        }
        return false;
      }
    private static boolean isNumPossible(int[][] puzzle, int posRow, int posCol,int num) {
     //any value in same row and same col
     for(int i=0;i<n;i++){
      if(puzzle[posRow][i]==num ||
       puzzle[i][posCol]==num){
          return false;
      }
     }
     //sub matrix
     posCol-=posCol%2; //0
     posRow-=posRow%2; //0
     for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        if(puzzle[i+posRow][j+posCol]==num){
            return false;
        }
      }
     }
     return true;
    }
    }