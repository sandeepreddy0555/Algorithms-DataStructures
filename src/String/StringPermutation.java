package String;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StringPermutation {


  public class Pair{
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

  public void permute(String perm, String word, Set<Pair> pairs) {
    if(word.isEmpty()){
      display(perm);
    }
    for(int i=0; i<word.length();i++){
      String tempperm = perm+word.charAt(i);
      String tempword = word.substring(0,i) + word.substring(i+1);
      Pair pair = new Pair(tempperm, tempword);
      if(pairs.add(pair))
      permute(tempperm, tempword, pairs);
    }
  }


  public void display(String string) {
    System.out.println(string);
  }

  public static void display(Set<String> strings) {
    for (String string : strings) {
      System.out.println(string +"\n");
    }
  }


  public static void main(String args[]) {
    StringPermutation sp = new StringPermutation();
    Set<Pair> pairs = new HashSet<>();
    sp.permute("", "AABCACFGHAKJFGHQK",  pairs);
  }



}
