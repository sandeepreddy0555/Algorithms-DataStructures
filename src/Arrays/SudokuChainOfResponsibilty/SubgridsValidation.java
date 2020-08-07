package Arrays.SudokuChainOfResponsibilty;

import java.util.HashSet;
import java.util.Set;

public class SubgridsValidation implements SudokuChain {

  char[][] grid;
  SudokuChain chain;

  SubgridsValidation(char[][] grid)
  {
    this.grid = grid;
  }

  @Override
  public void setNext(SudokuChain chain) {
    this.chain = chain;
  }

  @Override
  public boolean process(char[][] grid) {
    return isSubgridValid();

  }

  public boolean isSubgridValid()
  {
    for (int i = 0; i < grid.length; i = (int) (i + Math.sqrt(grid.length))) {
      for (int j = 0; j < grid.length; j = (int) (j + Math.sqrt(grid.length))) {
        if (!isNxNSubGridValid(grid, i, j)) {
          return false;
        }
      }
    }
    return true;
  }


  public boolean isNxNSubGridValid(char[][] grid, int row, int column) {
    Set<Character> characterSet = new HashSet<>();
    for (int i = row; i < row + (int)  Math.sqrt(grid.length); i++) {
      for (int j = column; j < column + (int)  Math.sqrt(grid.length); j++) {
        if (CharacterValid.isValidCharacter(grid[i][j], characterSet) == false) {
          return false;
        }
      }
    }
    return true;
  }

}
