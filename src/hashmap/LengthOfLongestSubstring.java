package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

  public int lengthOfLongestSubstring(String s) {

    if(s == null || s.length() == 0)
      return 0;

    int left =0, right = 0, result = Integer.MIN_VALUE;
    Map<Character, Integer> map = new HashMap<>();
    while(right < s.length()){
      Character ch = s.charAt(right);
      if(map.containsKey(ch)){
        left = Math.max(map.get(ch)+1, left);
      }

      map.put(ch, right);
      result = Math.max(result, right-left+1);
      right++;
    }

    return result;
  }
}
