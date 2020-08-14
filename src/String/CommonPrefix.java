package String;

public class CommonPrefix {


  public static void main(String args[]){
    String strs[] = {"flower", "flow","fl"};
    CommonPrefix commonPrefix = new CommonPrefix();
    System.out.println(commonPrefix.longestCommonPrefix(strs));
  }



  class Node {

    char ch;
    Node next;

    Node() {
      this.next = null;
    }

    Node(char ch, Node next) {
      this.ch = ch;
      this.next = next;
    }
  }

  Node node;

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    if (strs.length == 1) {
      return strs[0];
    }

    node = new Node();
    Node temp = node;
    for (int i = 0; i < strs[0].length(); i++) {
      temp.ch = strs[0].charAt(i);
      temp.next = new Node();
      temp = temp.next;
    }

    int counter = 0;
    int res = Integer.MAX_VALUE;
    for (int i = 1; i < strs.length; i++) {
      String str = strs[i];
      Node temp2 = node;
      for (int j = 0; j < str.length() && counter < res; j++) {
        if (temp2.ch == str.charAt(j)) {
          counter++;
          temp2 = temp2.next;
          continue;
        } else break;
      }
      res = Math.min(res, counter);
      counter = 0;
    }

    return res == Integer.MAX_VALUE ? "" : strs[0].substring(0, res);

  }


}
