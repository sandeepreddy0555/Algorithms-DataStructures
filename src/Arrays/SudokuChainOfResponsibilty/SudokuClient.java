package Arrays.SudokuChainOfResponsibilty;

public class SudokuClient {


  public static void main(String[] args) {

    char[][] grid = {{'.', '.', '.', '.', '.', '.', '5', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},

        {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
        {'8', '.', '7', '.', '.', '.', '3', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},

        {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '6', '1', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '5', '2', '.', '.'}};

    SudokuChain chain1 = new RowsValidation(grid);
    SudokuChain chain2 = new ColumnsValidation(grid);
    SudokuChain chain3 = new SubgridsValidation(grid);
    chain1.setNext(chain2);
    chain2.setNext(chain3);

    System.out.println(chain1.process(grid));

  }

}
