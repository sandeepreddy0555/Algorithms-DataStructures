package Arrays.Sudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sudoku {

  static char[][] grid = {{'.', '.', '.', '.', '.', '.', '5', '.', '.'},
      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},

      {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
      {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},

      {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
      {'.', '.', '.', '.', '.', '1', '.', '.', '.'},
      {'.', '.', '.', '.', '.', '5', '2', '.', '.'}};

  static Set<Character> validCharacters = new HashSet<>(
      Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '.'));


  public Sudoku(char[][] grid, Set<Character> validCharacters) {
    this.grid = grid;
    this.validCharacters = validCharacters;
  }


  public static void main(String args[]) {
    Sudoku sudoku = new Sudoku(grid, validCharacters);
    System.out.println(sudoku.isSudoku());
  }


  public boolean isSudoku() {

    // No  row should have same number and should be between 1-9 or .
    // No  column should have same number  and should be between 1-9 or .
    // all 3x3 grids should have 1-9 or .

    boolean isSudoku = false;
    boolean isValidRows = isValidRows();
    if (isValidRows) {
      boolean isValidColumns = isValidColumns();
      if (isValidColumns) {
        boolean isSubGridValid = isSubGridValid();
        if (isSubGridValid) {
          isSudoku = true;
        }
      }
    }
    return isSudoku;

  }

  public boolean isSubGridValid() {

    for (int i = 0; i < grid.length; i = i + 3) {
      for (int j = 0; j < grid.length; j = j + 3) {
        if (!is3X3SubGridValid(grid, i, j)) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean is3X3SubGridValid(char[][] grid, int row, int column) {
    boolean is3X3SubGridValid = false;
    Set<Character> characterSet = new HashSet<>();
    for (int i = row; i < row + 3; i++) {
      for (int j = column; j < column + 3; j++) {
        if (isValidCharacter(grid[i][j], characterSet) == false) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isValidColumns() {
    for (int i = 0; i < grid.length; i++) {
      Set<Character> characterSet = new HashSet<>();
      for (int j = 0; j < grid.length; j++) {
        if (isValidCharacter(grid[j][i], characterSet) == false) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isValidRows() {
    for (int i = 0; i < grid.length; i++) {
      Set<Character> characterSet = new HashSet<>();
      for (int j = 0; j < grid[i].length; j++) {
        if (isValidCharacter(grid[i][j], characterSet) == false) {
          return false;
        }
      }
    }
    return true;
  }


  public boolean isValidCharacter(char ch, Set<Character> characterSet) {
    if (validCharacters.contains(ch)) {
      if (ch != '.' && !characterSet.add(ch)) {
        return false;
      }
    } else {
      return false;
    }
    return true;

  }

}
