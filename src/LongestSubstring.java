public class LongestSubstring {


  public static void main(String args[])
  {

    System.out.println(lengthOfLongestSubstring("bbbb"));


  }



  public static int lengthOfLongestSubstring(String s) {
    StringBuilder  stringBuilder = new StringBuilder();
    int longestSubStringLength = 0;
    int counter = 0;

    if(s != null && s.length() > 0)
    {
      for(int i=0; i<=s.length() -1; i++)
      {

        if(stringBuilder.toString().indexOf(s.charAt(i)) != -1)
        {
          if(counter > longestSubStringLength){
            longestSubStringLength = counter;
          }
          counter = 1;
          stringBuilder = new StringBuilder(s.charAt(i));
        }
        else
        {
          stringBuilder.append(s.charAt(i));
          counter++;

        }

      }

      if(counter > longestSubStringLength){
        longestSubStringLength = counter;
      }
    }

    return longestSubStringLength;
  }

}
