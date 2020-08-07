package goldman;

import java.util.HashMap;
import java.util.Map;

public class SharesPurchase {



  public static int analyzeInvestments(String s, String input) {

    // maintain input chars in map with count
    // iteratere through s , maintain map with chars in S , check stringmapchars size with inputmapchars to determine    formedsize, if formedsize == requiredsize increment result and add then add length - index-1 to the result,  remove the charcount from stringmap and update the formedsize, increment left pointer until formedsize=requiredsize


    Map<Character,Integer> inputMap = new HashMap<Character,Integer>();

    char[] inputCharArray = input.toCharArray();
    for(int i=0;i<=input.length()-1;i++){
      Integer count = inputMap.getOrDefault(inputCharArray[i],0);
      inputMap.put(inputCharArray[i], count+1);
    }

    int requiredSize= inputMap.size();
    int formedSize = 0;
    int left = 0,  result=0;

    Map<Character,Integer> stringMap= new HashMap<Character,Integer>();
    for(int i=0;i<=s.length()-1;i++)
    {
      Integer count = stringMap.getOrDefault(s.charAt(i),0);
      stringMap.put(s.charAt(i), count+1);

      if(inputMap.containsKey(s.charAt(i)) && inputMap.get(s.charAt(i)).equals(stringMap.get(s.charAt(i)))){
        formedSize++;
      }

      while(requiredSize == formedSize){
        result++;
        result = result + s.length()-1-i;
        Integer charCount = stringMap.getOrDefault(s.charAt(left), 0);
        if(!charCount.equals(0)){
          stringMap.put(s.charAt(left),charCount-1);
        }

        if(inputMap.containsKey(s.charAt(left)) && inputMap.get(s.charAt(left)) > (stringMap.get(s.charAt(left)))){
          formedSize--;
        }



        left++;



      }




    }






    return result;

  }


  //determine the period where all 3 investments A,b,c are holded at any point of time.
  public static void main(String[] args) {

    String s = "ABBCZBAC", input = "ABC";

    System.out.println(SharesPurchase.analyzeInvestments(s, input));


  }


}
