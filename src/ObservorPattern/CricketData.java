package ObservorPattern;


import java.util.ArrayList;
import java.util.Collection;

public class CricketData {

  int runs, overs, wickets;

  Collection<IDisplayObservor> displayObservors;

  CricketData()
  {
    this.displayObservors = new ArrayList<>();
  }


  public CricketData(int runs, int overs, int wickets) {
    this();
    this.runs = runs;
    this.overs = overs;
    this.wickets = wickets;
  }

  public void registerObservor(IDisplayObservor displayObservor) {
    displayObservors.add(displayObservor);
  }

  public void unRegisterObservor(IDisplayObservor displayObservor) {
    displayObservors.remove(displayObservor);
  }

  public int getRuns() {
    return runs;
  }

  public void setRuns(int runs) {
    this.runs = runs;
  }

  public int getWickets() {
    return wickets;
  }

  public void setWickets(int wickets) {
    this.wickets = wickets;
  }

  public int getOvers() {
    return overs;
  }

  public void setOvers(int overs) {
    this.overs = overs;
  }

  public void notifyObservors()
  {
    displayObservors.forEach(displayObservor -> displayObservor.update(runs, overs, wickets));
  }

}
