package goldman;

public class MinsubArray {


  public  static void main(String args[]) {


    int [] nums = {2,3,1,2,4,3};
    System.out.println(minSubArrayLen(7, nums));

  }



  //s = 7, nums = [2,3,1,2,4,3] two pointer or sliding window. minimum subarraylen equal to the target
    public static int minSubArrayLen(int target, int[] nums) {
      int sum = 0, left = 0, minlength = -1 ;

      for(int i=0; i<nums.length;i++){

        sum = sum + nums[i];

        while(sum>=target && left < nums.length){

          if(sum == target) {

            if(minlength == -1 || minlength > i-left+1)
              minlength = i-left+1;

          }

          sum = sum - nums[left];
          left++;
        }



      }

      return minlength;



    }

/*      int left =0, right =0;
      int sum = 0;
      int minlength = Integer.MAX_VALUE;

      for(int i=right; i<nums.length;i++){

        sum = sum + nums[right];

        while(sum >= s && left<nums.length){

          minlength = Math.min(minlength, right-left+1);
          sum = sum - nums[left];
          left++;

        }
        right ++;

      }
      return minlength!=Integer.MAX_VALUE?minlength:0;

    }*/



}
