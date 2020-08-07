package Arrays.SudokuChainOfResponsibilty;

import java.util.HashSet;
import java.util.Set;

public class ColumnsValidation implements SudokuChain {


  char[][] grid;
  SudokuChain chain;

  ColumnsValidation(char[][] grid)
  {
    this.grid = grid;
  }

  @Override
  public void setNext(SudokuChain chain) {
    this.chain = chain;
  }

  @Override
  public boolean process(char[][] grid) {
    return isValidColumns() ? chain.process(grid): false;
  }

  public boolean isValidColumns() {
    for (int i = 0; i < grid.length; i++) {
      Set<Character> characterSet = new HashSet<>();
      for (int j = 0; j < grid.length; j++) {
        if (CharacterValid.isValidCharacter(grid[j][i], characterSet) == false) {
          return false;
        }
      }
    }
    return true;
  }


}
