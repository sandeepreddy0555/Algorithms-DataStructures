import java.util.HashMap;
import java.util.Map;

public class ContainsCloseNums {

  public static void main(String args[])
  {
    int[] nums = {1,0,1,1};
    int k =1;
    System.out.println(containsCloseNums(nums, k));
  }

  public static boolean  containsCloseNums(int[] nums, int k) {

    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++)
    {
      if(map.containsKey(nums[i]))
      {
        int difference = i - map.get(nums[i]).intValue();
        if(difference <= k)
        {
          return true;
        }
      }
      else
      {
        map.put(nums[i], i);
      }
    }
    return false;
  }

}
