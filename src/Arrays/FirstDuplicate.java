package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {



  public static void main(String args[])
  {
    int[] a = new int[]{2, 1, 3, 5, 3, 2};
    System.out.println(firstDuplicate(a));
  }




  static int firstDuplicate(int[] a) {

    int num = -1;

    Set<Integer> set = new HashSet<>();

    for(int i=0; i<=a.length -1;i++ )
    {
      if(!set.add(a[i]))
      {
        num = a[i];
        return num;
      }
    }

    return num;
  }

}
