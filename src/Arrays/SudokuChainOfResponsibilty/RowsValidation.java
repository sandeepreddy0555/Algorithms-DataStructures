package Arrays.SudokuChainOfResponsibilty;

import java.util.HashSet;
import java.util.Set;

public class RowsValidation implements SudokuChain {


  char[][] grid;
  SudokuChain chain;


  RowsValidation(char[][] grid) {
    this.grid = grid;
  }

  @Override
  public void setNext(SudokuChain chain) {
    this.chain = chain;
  }

  @Override
  public boolean process(char[][] grid) {
    return isValidRows() ? chain.process(grid): false;
  }

  public boolean isValidRows() {
    for (int i = 0; i < grid.length; i++) {
      Set<Character> characterSet = new HashSet<>();
      for (int j = 0; j < grid.length; j++) {
        if (CharacterValid.isValidCharacter(grid[i][j], characterSet) == false) {
          return false;
        }
      }
    }
    return true;
  }


}
