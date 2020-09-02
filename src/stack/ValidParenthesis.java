package stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;
import java.util.Stack;

public class ValidParenthesis {


  public boolean isValid(String s) {
    if(s == null || s.isEmpty())
      return true;

    Stack<Character> stack = new Stack<Character>();
    Set<Character> openSet = new HashSet<>(Arrays.asList( '(', '{', '[' ) );
    Set<Character> closeSet = new HashSet<>(Arrays.asList( ')', '}', ']' ));
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    for(int i=0;i<s.length();i++){
      if(map.containsKey( s.charAt(i) )){
        stack.push(s.charAt(i));
      }else {
        Character poppedValue = stack.isEmpty() ? '#': stack.pop();
        if(!map.containsKey(poppedValue) ||  !map.get(poppedValue).equals(s.charAt(i))){
          return false;
        }
      }

    }

    if(!stack.isEmpty())
      return false;

    return true;
  }

}
