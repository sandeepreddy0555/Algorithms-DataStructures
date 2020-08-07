package goldman;

public class ReverseString {

  public static void main(String[] args) {

    String s = "i.like.this.program.very.much";

    String[] words = s.split("\\.");



    StringBuilder wordBuilder = new StringBuilder();
    for (int i = 0; i <= words.length - 1; i++) {
      wordBuilder.append(words[i]);

    }

    System.out.println("reversestring:" + wordBuilder.toString());


  }



}
