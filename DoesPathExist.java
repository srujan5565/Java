/**
 * main
 * 1)find src pos
 * 2)perform dfs ->up,down,left,right
 */
class DFS{
  int RowUtil[]={-1,1,0,0};
  int ColUtil[]={0,0,-1,1};

  public void FindPathExist(int[][] grid) {
    boolean visited[][]= new boolean[grid.length][grid.length];
    int srcRow=-1;
    int srcCol=-1;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
        if(grid[i][j]==1){
            srcCol=j;
          srcRow=i;
          break;
        }
      }
    }
    System.out.println(CheckPath(visited,grid,srcRow,srcCol));
  }

  private boolean CheckPath(boolean[][] visited, int[][] grid, int srcRow, int srcCol) {
    if(grid[srcRow][srcCol]==2){
      return true;
    }visited[srcRow][srcCol]=true;
    for(int check=0;check<4;check++){    //check neighbour ->up,down,left,right
      int newRow = srcRow+RowUtil[check];
      int newCol = srcCol+ColUtil[check];
      if(ValidMove(grid,visited,newRow,newCol)){
        if(CheckPath(visited,grid,newRow,newCol)){
          return true;
        }
      }
    }//go back if path is not found
    visited[srcRow][srcCol]=false;
    return false;

  }

  private boolean ValidMove(int[][] grid, boolean[][] visited, int newRow, int newCol) {
  //not go out of index, not be 0 , should not be true
    int n=grid.length;
    return newRow>=0 && newRow <n  && newCol>=0 && newCol<n && grid[newRow][newCol]!=0 &&
    !visited[newRow][newCol] ;
  }

}
public class DoesPathExist {
   public static void main(String[] args) {
    int grid[][]=
    {{0, 3, 3, 0},
    {0, 3, 0, 0},
    {0, 3, 0, 2},
    {3, 3, 1, 0}};
    DFS dfs = new DFS();
    dfs.FindPathExist(grid);
   }
}