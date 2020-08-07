package goldman;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Rainwater {



//tiem complexitY o(n) ,space complexity O(n) -leetcode

    public int trap(int[] height) {

      int trappedUnits = 0;

      if(height.length <=2)
        return 0;

      int[] leftMaxArray = new int[height.length];
      int[] rightMaxArray = new int[height.length];




      leftMaxArray[0] = height[0];
      for(int i=1; i<= height.length - 1; i++){
        int max = Math.max(leftMaxArray[i-1], height[i]);
        leftMaxArray[i] = max;

      }

      rightMaxArray[height.length -1]  = height[height.length -1];

      for(int i= height.length - 2; i>= 0; i--){
        int max = Math.max(rightMaxArray[i+1], height[i]);
        rightMaxArray[i] = max;

      }



      for(int i=0; i<= height.length - 1; i++){
        trappedUnits = trappedUnits + Math.min(leftMaxArray[i], rightMaxArray[i]) -  height[i];
      }
      return trappedUnits;
    }



}
