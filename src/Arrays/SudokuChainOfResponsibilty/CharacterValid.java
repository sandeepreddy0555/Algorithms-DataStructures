package Arrays.SudokuChainOfResponsibilty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CharacterValid {

  static Set<Character> validCharacters = new HashSet<>(
      Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '.'));


  public static boolean isValidCharacter(char ch, Set<Character> characterSet)
  {

    if (validCharacters.contains(ch)) {
      if (ch != '.' && !characterSet.add(ch)) {
        return false;
      }
    } else {
      return false;
    }
    return true;

  }

}
