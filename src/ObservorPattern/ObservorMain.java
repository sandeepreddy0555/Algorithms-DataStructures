package ObservorPattern;

public class ObservorMain {

  public static void main(String args[])
  {
    CricketData cricketData = new CricketData(100, 10, 2);
    cricketData.registerObservor(new ScoreDisplayObservor());
    AvgDisplayObservor avgDisplayObservor = new AvgDisplayObservor();
    cricketData.registerObservor(avgDisplayObservor);
    cricketData.unRegisterObservor(avgDisplayObservor);
    cricketData.notifyObservors();



  }

}
