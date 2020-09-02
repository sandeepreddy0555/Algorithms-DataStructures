package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Keypad {

  static Map<Character, String> map;
  static{
    map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
  }
  int digitsLength = 0;
  char[] outputArray;

  List<String> output = new ArrayList<>();

  public List<String> letterCombinations(String digits) {
    if(digits == null || digits.isEmpty())
      return output;
    digitsLength = digits.length();
    outputArray = new char[digitsLength];
    letterCombinationsHelper(outputArray, digits.toCharArray());
    return output;
  }

  public void letterCombinationsHelper(char[] outputArray, char[] digitsArray){
    if(digitsArray.length == 0){
      output.add(String.valueOf(outputArray));
    }

    else{
      char digitchar = digitsArray[0];
      char[] letters = map.get(digitchar).toCharArray();
      for(int i=0;i<letters.length;i++){
        outputArray[digitsLength - digitsArray.length] = letters[i];
        letterCombinationsHelper(outputArray, Arrays.copyOfRange(digitsArray, 1, digitsArray.length));
      }
    }


  }

}
