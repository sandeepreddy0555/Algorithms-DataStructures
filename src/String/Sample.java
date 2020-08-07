package String;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sample {

  public static class Pair{
    String perm;
    String word;

    Pair(String perm, String word){
      this.perm = perm;
      this.word = word;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Pair pair = (Pair) o;
      return perm.equals(pair.perm) &&
          word.equals(pair.word);
    }

    @Override
    public int hashCode() {
      return Objects.hash(perm, word);
    }
  }


  public static void main(String args[]){

    Set<Pair> pairs = new HashSet<>();
    Pair pair1 = new Pair("san", "anu");
    Pair pair2 = new Pair("san", "anu");
    if(pairs.add(pair1))
      System.out.println("true");
    else
      System.out.println("false");

    if(pairs.add(pair2))
      System.out.println("true");
    else
      System.out.println("false");



  }
}
