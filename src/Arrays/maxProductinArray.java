package Arrays;

public class maxProductinArray {

  //negative, zero and positive numbers
  public int maxProduct(int[] nums) {
    if(nums.length == 0)
      return 0;

    int maxProduct = nums[0], minProduct=nums[0], result = nums[0];


    for(int i=1;i<nums.length;i++){
      int temp =   maxProduct;
      maxProduct = Math.max(maxProduct*nums[i], Math.max(nums[i], minProduct*nums[i]));
      minProduct = Math.min(minProduct*nums[i], Math.min(nums[i], temp*nums[i]));
      result = Math.max(result, maxProduct);

    }
    return result ;
  }

}
