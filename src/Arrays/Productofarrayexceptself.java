package Arrays;

public class Productofarrayexceptself {


  public int[] productExceptSelf(int[] nums) {

    if(nums.length == 0)
      return new int[] {};

    int[] output = new int[nums.length];
    output[0] = 1;
    for(int i=1;i<nums.length;i++){
      output[i] = nums[i-1]*output[i-1];
    }

    int rightProduct = 1;
    for(int i=nums.length-1;i>=0;i--){
      output[i] = output[i]*rightProduct;
      rightProduct*=nums[i];
    }

    return output;
  }

}
