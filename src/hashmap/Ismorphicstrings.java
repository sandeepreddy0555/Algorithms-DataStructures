package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Ismorphicstrings {

  public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> smap = new HashMap<>();
    Map<Character, Character> tmap = new HashMap<>();

    for(int i=0;i<s.length();i++){
      Character schar = s.charAt(i);
      Character tchar = t.charAt(i);
      if(smap.containsKey(schar) || tmap.containsKey(tchar)){
        if(!tchar.equals(smap.get(schar)) || !schar.equals(tmap.get(tchar))){
          return false;
        }
      }else{
        smap.put(schar, tchar);
        tmap.put(tchar,schar);
      }

    }
    return true;
  }

}
