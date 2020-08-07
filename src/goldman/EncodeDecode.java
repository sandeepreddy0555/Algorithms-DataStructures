package goldman;

class EncodeDecode {


  //open , 123
  public static String encode(String message, String key) {


    StringBuilder stringBuilder = new StringBuilder();

    for(int i=0;i<=message.length()-1; i++){

      if(i < key.length()) {
        int count =  key.charAt(i) -'0';
        while(count > 0)
        {

          stringBuilder.append(message.charAt(i));
          count --;
        }

      }
      else
        stringBuilder.append(message.charAt(i));

    }

    return stringBuilder.toString();


  }


  //oppeeen , 123
  public static String decode(String message, String key) {

    int index =0;
    StringBuilder stringBuilder = new StringBuilder();

    for(int i=0;i<=key.length()-1; i++){

      int count =  key.charAt(i) -'0';
      while(count > 1)
      {
        count--;
        index++;
      }

      stringBuilder.append(message.charAt(index));
      index++;
    }

    if(message.length() > index){
      stringBuilder.append(message.substring(index));
    }

    return  stringBuilder.toString();


  }




  public static String secureChanel(Integer operation, String message, String key) {


    switch(operation) {

      case 1: return encode(message, key);

      case 2: return decode(message, key);

      default: return "-1";



    }




  }
  public static void main(String[] args) {

    // operation, message, key

    Integer operation = 1;
    String message ="open", input="123";

    System.out.println(secureChanel(operation, message, input));
    operation = 2;
    message ="oppeeen";
    input="123";
    System.out.println(secureChanel(operation, message, input));



  }



}

