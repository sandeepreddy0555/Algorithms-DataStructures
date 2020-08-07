package goldman;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maxavgscore {

  static class Student {

    String name;
    Integer totalMarks;
    Integer count = 0;
    Float average= 0.0f;


    public Float getAverage() {
      return average;
    }

    public void setAverage(Float average) {
      this.average = average;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }


  public static void main(String[] args) {

    //String[][] scores = new String[][]{{"jerry", "65"}, {"bob", "91"}, {"jerry", "23"}, {"Eric", "83"}};

    String[][] scores = new String[][]{};

    Map<String, Student> map = new HashMap<>();

    for (int i = 0; i < scores.length; i++) {

      String[] score = scores[i];

      if (map.containsKey(score[0])) {

        Student student = map.get(score[0]);
        student.totalMarks = student.totalMarks + Integer.parseInt(score[1]);
        student.count = student.count + 1;
        map.put(score[0], student);

      } else {
        Maxavgscore.Student student = new Maxavgscore.Student();
        student.name = score[0];
        student.totalMarks = Integer.parseInt(score[1]);
        student.count = student.count+1;
        map.put(score[0], student);

      }


    }

    List<Student> students =  map.values().stream().collect(Collectors.toList());
    students.forEach(student -> {
      student.average = Float.valueOf(student.totalMarks/student.count);
    });

    Collections.sort(students, Comparator.comparing(Student::getAverage).reversed());
    if(!students.isEmpty())
    System.out.println("name:"+ students.get(0).name +" avg:" + students.get(0).average);


  }

}
