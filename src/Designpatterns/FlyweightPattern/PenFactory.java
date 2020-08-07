package Designpatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class PenFactory {


  static Map<String, Pen> map = new HashMap<>();
  public Pen getPen(PenType penType, PenColor penColor){

    String key = String.format("%s_%s", penType.toString(), penColor.toString());
    if(!map.containsKey(key)) {
      Pen pen = new Pen();
      pen.setType(penType);
      pen.setColor(penColor);
      map.put(key, pen);
    }
    return map.get(key);

  }


}
