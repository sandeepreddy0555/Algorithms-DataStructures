package goldman;

public class Freqofsubstring {


  public static void main(String[] args) {

/*    String pattern = "man";
    String str = "mansomemansomeman";
    int freq = 0;
    int j=0;
    int requiredSize = pattern.length();

    for(int i=0; i<str.length();i++){

      if(str.charAt(i) == pattern.charAt(j)){
        j++;


        if(j == requiredSize){
          j=0;
          freq++;
        }
      }
      else{
        j=0;
      }



    }

    System.out.println("freq"+freq);*/

    String pattern = "man";
    String str = "mansomemansomeman";

    int index = 0, counter =0;
    while (index != -1 && index < str.length()){

      index = str.indexOf(pattern, index);

      index = index + pattern.length();

      counter ++;

    }

    System.out.println("counter:" + counter);


  }

}
