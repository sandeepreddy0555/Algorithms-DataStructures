package stack;

public class NumberOfIslands {


  int rowlen;
  int collen;


  public int numIslands(char[][] grid) {
    if(grid == null || grid.length == 0)
      return 0;

    int numofislands = 0;
    char[][] visited = new char[grid.length][grid[0].length];
    this.rowlen = grid.length;
    this.collen = grid[0].length;
    for(int i=0;i<rowlen;i++){
      for(int j=0;j<collen;j++){
        if(grid[i][j] == '1' && visited[i][j] != '1'){
          numofislands++;
          dfs(grid, visited, i, j);
        }

      }
    }

    return numofislands;
  }


  public void dfs(char[][] grid, char[][] visited, int row, int col){

    if(row < 0 || col < 0 || row >=  this.rowlen || col >= this.collen || grid[row][col] == '0' || visited[row][col] == '1')
      return;

    visited[row][col] = '1';
    dfs(grid, visited, row-1, col);
    dfs(grid, visited, row+1, col);
    dfs(grid, visited, row, col-1);
    dfs(grid, visited, row, col+1);


  }
}
