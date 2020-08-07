package goldman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maxaveragebetterversion {


  public static Float calculateAverage(List<Integer> marks) {

    Float sum = 0.0f;
    for (Integer mark : marks) {
      sum = sum + mark;
    }
    return sum / marks.size();
  }


  public static void main(String[] args) {

    String[][] scores = {{"bob", "90"}, {"brian", "70"}, {"sandeep", "30"}, {"bob", "40"}};

    Map<String, List<Integer>> scoreMap = new HashMap<>();
    for (int i = 0; i <= scores.length - 1; i++) {

      String[] score = scores[i];
      if (scoreMap.containsKey(score[0])) {
        List<Integer> marks = scoreMap.get(score[0]);
        marks.add(Integer.parseInt(score[1]));
        scoreMap.put(score[0], marks);

      } else {
        List<Integer> marks = new ArrayList<>();
        marks.add(Integer.parseInt(score[1]));
        scoreMap.put(score[0], marks);
      }


    }
    Float maxAvg = -1.0f;
    String student = null;

    for (Entry<String, List<Integer>> entry : scoreMap.entrySet()) {

      List<Integer> marks = entry.getValue();
      Float averageMarksofStudent = Maxaveragebetterversion.calculateAverage(marks);

      if (maxAvg < averageMarksofStudent) {
        maxAvg = averageMarksofStudent;
        student = entry.getKey();

      }


    }

    System.out.println("maxavg value:" + maxAvg + " student:" + student);

  }


}
