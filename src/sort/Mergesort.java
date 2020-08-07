package sort;

public class Mergesort {

  static int[] output;
  static int k=0;

  public static void mergesort(int[] input){
    output = new int[input.length];
    split(input, 0, input.length-1);


  }


 static void split(int[] input, int left, int right) {

    if(left < right){
       int middle = (left+right)/2;
       split(input, left, middle);
       split(input, middle+1, right);
       merge(input, left, middle, middle+1, right);

    }
  }


  static void  merge(int[] input, int l1start, int l1end, int l2start, int l2end) {

    int[] arr1 = new int[l1end-l1start+1];
    int[] arr2 = new int[l2end-l2start+1];
    int i=0, j=0;

    while(l1start <=  l1end){
      arr1[i] = input[l1start];
      i++;
      l1start++;
    }


    while(l2start <=  l2end){
      arr2[j] = input[l2start];
      j++;
      l2start++;
    }



    int x=0, y = 0;

    while(x<arr1.length && y<arr2.length){

      if(arr1[x] < arr2[y]){
        input[k] = arr1[x];
        x++;
      }else{
        input[k] = arr2[y];
        y++;
      }
      k++;

    }


    while(x<arr1.length) {
      input[k] = arr1[x];
      k++;
      x++;
    }


    while(y<arr1.length) {
      input[k] = arr2[y];
      k++;
      y++;
    }



  }






  public static void main(String args[]) {
    int[] nums = {1,5,3,2,8,7,6,4};
    mergesort(nums);
    for(int num : nums){
      System.out.print(num+" ");
    }


  }

}
