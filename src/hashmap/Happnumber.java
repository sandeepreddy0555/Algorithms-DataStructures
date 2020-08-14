package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Happnumber {


  public static boolean isHappy(int n) {

    Set<Integer> set = new HashSet<>();

    while(set.add(n)){
      int total = 0;
      int rem=0;
      while(n>0){
        rem=n%10;
        n=n/10;
        total = total+rem*rem;
      }
      if(total == 1){
        return true;
      }


      n = total;
    }
    return false;

  }


  public static void main(String args[]){
    isHappy(1);
  }


}
