package Arrays.SudokuChainOfResponsibilty;

public interface SudokuChain {

  public void setNext(SudokuChain chain);
  public boolean process(char[][] grid);

}
