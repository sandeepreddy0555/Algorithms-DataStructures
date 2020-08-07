package java8;

import java.util.Arrays;
import java.util.List;

public class Java8Samples {


public static  void  main(String args[])
{

  List<String> list = Arrays.asList("a","b");

  list.stream().forEach(string -> System.out.println(string));


}




}
