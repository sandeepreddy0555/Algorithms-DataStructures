package String;

public class Encodestring {




  public static String encode(String str) {

    StringBuilder sb = new StringBuilder();
    int counter = 1;

    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i - 1) == str.charAt(i)) {
        counter++;
      } else {
        sb.append(str.charAt(i - 1));
        sb.append(counter);
        counter = 1;
      }

      if (i == str.length() - 1) {
        sb.append(str.charAt(i));
        sb.append(counter);
      }



    }
    return sb.toString();

  }
  public static void main(String args[]){

    System.out.println(encode("aaabbc"));
  }



}
