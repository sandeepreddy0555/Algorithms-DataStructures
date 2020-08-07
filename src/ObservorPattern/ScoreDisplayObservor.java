package ObservorPattern;

public class ScoreDisplayObservor implements IDisplayObservor {

  int runs, wickets;


  public void setRuns(int runs) {
    this.runs = runs;
  }

  public int getRuns() {
    return runs;
  }

  public int getWickets() {
    return wickets;
  }

  public void setWickets(int wickets) {
    this.wickets = wickets;
  }

  @Override
  public void update(int runs, int overs, int wickets) {

    this.runs = runs;
    this.wickets = wickets;
    System.out.println("runs/wickets:" + runs+"/"+wickets);
  }



}
