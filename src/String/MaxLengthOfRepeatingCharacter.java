package String;

public class MaxLengthOfRepeatingCharacter {

  public static int lengthofrepeatingchar(String str){

    if(str == null || str.length() == 0)
      return 0;

    int count = 1;
    int result = 1;

    for(int i=1;i<str.length();i++){
      if(str.charAt(i) == str.charAt(i-1)) count++;
      else{
        result = Math.max(count, result);
        count =1;
      }

      if(i==str.length()-1){
        result = Math.max(count, result);
      }
    }
    return result;
  }

  public static void main(String args[]){
    System.out.println(lengthofrepeatingchar("aaabbbbb"));
    System.out.println(lengthofrepeatingchar("abcde"));
    System.out.println(lengthofrepeatingchar("aaaaacde"));
    System.out.println(lengthofrepeatingchar("a"));

  }
}
