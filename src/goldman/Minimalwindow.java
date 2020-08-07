package goldman;

import java.util.HashMap;
import java.util.Map;

public class Minimalwindow {


  public  static void main(String args[]) {


    System.out.println(minWindow("ADOBECODEBANC", "ABC"));

  }



  public static String minWindow(String s, String t) {

    if(s == null || t == null || s.length() < t.length()){
      return "";
    }

    //tmap
    Map<Character, Integer> tmap = new HashMap<>();
    for(int i=0; i<=t.length()-1; i++){
      Integer count = tmap.getOrDefault(t.charAt(i), 0);
      tmap.put(t.charAt(i), count+1);
    }

    int requiredSize = tmap.size();
    int formedSize = 0;
    int left = 0, right=0;
    int[] arr = {-1, 0, 0}; //windowsize, left,  right

    Map<Character, Integer> smap = new HashMap<>();
    for(int i=0;i<=s.length()-1;i++){
      Integer count = smap.getOrDefault(s.charAt(i), 0);
      smap.put(s.charAt(i), count+1);

      if(tmap.containsKey(s.charAt(i)) && tmap.get(s.charAt(i)).equals(smap.get(s.charAt(i)))){
        formedSize++;
      }

      while(formedSize == requiredSize){
        if(arr[0] == -1 || arr[0]>right-left+1){
          arr[0] = right - left + 1;
          arr[1]=left;
          arr[2]=right;
        }

        Integer countofchar = smap.getOrDefault(s.charAt(left), 0);
        smap.put(s.charAt(left), countofchar-1);

        if( tmap.containsKey(s.charAt(left)) && tmap.get(s.charAt(left)) > smap.get(s.charAt(left)) ){
          formedSize--;
        }



        left++;
      }



      right++;
    }

    return arr[0] == -1 ? "":s.substring(arr[1], arr[2]+1);
  }

}
