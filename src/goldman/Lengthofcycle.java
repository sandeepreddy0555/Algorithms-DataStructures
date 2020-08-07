package goldman;

import java.util.HashSet;
import java.util.Set;

public class Lengthofcycle {


  public static int lengthOfCycle(int[] arr, int startIndex) {
    // todo

    //lengthOfCycle([1, 0], 0); // 2
    //lengthOfCycle([1, 2, 0], 0); // 3
    //lengthOfCycle([1, 2, 3, 1], 0); // 3 follow arr[index] to find loop

    if(arr.length == 0 || startIndex >arr.length -1 || startIndex < 0)
      return -1;

    int value = arr[startIndex];
    Set<Integer> set = new HashSet<>();
    int count = 0;
    while(set.add(value)){

      if(value > arr.length - 1)
        return -1;

      count++;
      value = arr[value];
    }



    return count;

  }


  public static void main(String[] args) {

    int arr[] = {1,2,1,5}, startindex = 0;

    System.out.println(Lengthofcycle.lengthOfCycle(arr, startindex));


  }


}
