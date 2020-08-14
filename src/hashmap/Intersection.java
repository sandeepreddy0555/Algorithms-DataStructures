package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    for(int i: nums1)
      set1.add(i);

    Set<Integer> set2 = new HashSet<>();
    for(int i: nums2)
      set2.add(i);

    if(set1.size() > set2.size())
      return intersectionhelper(set2, set1);
    else
      return intersectionhelper(set1, set2);


  }

  int[] intersectionhelper(Set<Integer> smallSet, Set<Integer> bigSet){
    int[] result = new int[smallSet.size()];
    int index = 0;
    for(Integer integer : smallSet){

      if(bigSet.contains(integer)){
        result[index] = integer;
        index++;
      }

    }

    return java.util.Arrays.copyOf(result,index);
  }

}
