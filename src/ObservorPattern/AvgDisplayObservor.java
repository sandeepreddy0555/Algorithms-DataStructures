package ObservorPattern;


public class AvgDisplayObservor implements IDisplayObservor {


  int runRate;

  public int getRunRate() {
    return runRate;
  }

  public void setRunRate(int runRate) {
    this.runRate = runRate;
  }

  @Override
  public void update(int runs, int overs, int wickets) {
    this.runRate = runs / overs;
    System.out.println("runrate" + runRate);

  }


}
