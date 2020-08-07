public class Solution {
  public static int search(int[] nums, int target) {
    return searchHelper(nums, 0, nums.length-1, target);
  }

  public static int searchHelper(int[] nums, int left, int right, int target){

    if(left > right)
      return -1;

    int middle = (left+right)/2;
    if(nums[middle] == target)
      return middle;
    else if(nums[middle] > target)
      return searchHelper(nums, left, middle, target);
    else
      return searchHelper(nums, middle, right, target);
  }

  public static void main(String args[]){
    int nums[] = {-1,0,3,5,9,12};
    System.out.println(search(nums, 9));
  }

}