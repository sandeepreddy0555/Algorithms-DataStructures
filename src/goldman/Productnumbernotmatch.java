package goldman;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given a range of numbers [l, r] and an integer q. The task is to count all such number in the given range such that any digit of the number does not match with any digit in its product with the given number q
//Input: l = 10, r = 12, q = 2
    //Output: 1
public class Productnumbernotmatch {



  public static void main(String[] args) {

    int l=10, r=12, q=2;

    List<String> resultList = new ArrayList<>();

    for(int i=l; i<=r;i++){


      Integer product = i*q;


      String productString = product.toString();


      String numberString = Integer.toString(i);

      Set<Character> set = new HashSet<>();

      for(int j=0;j<=productString.length()-1;j++){
        set.add(Character.valueOf(productString.charAt(j)));

      }





      Boolean contains = Boolean.FALSE;
      for(int k=0;k<=numberString.length()-1;k++){

        if(set.contains(numberString.charAt(k))){
          contains = Boolean.TRUE;
          break;

        }

      }


      if(contains.equals(Boolean.FALSE)) {

        resultList.add(numberString);
      }




    }


    System.out.println( resultList.size());



  }
}
