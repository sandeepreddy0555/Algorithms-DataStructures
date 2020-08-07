import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LineSizesInFile {


  public static void main(String[] pArgs) throws IOException {

    List<String> list1 = Arrays.asList("Achu", "Archana");
    List<String> list2 = Arrays.asList("cat", "Dog");

    Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
    map.put(1, list1);
    map.put(2, list2);

    BiConsumer<Integer, List<String>> consumer = new BiConsumerImpl();
    map.forEach(consumer);

/*    map.forEach(
        (integer, names) -> {
      System.out.println(integer);
      System.out.println(names);
      names.forEach(name -> System.out.println(name));
    }
    );*/

  }
}


class BiConsumerImpl implements BiConsumer<Integer, List<String>> {

  @Override
  public void accept(Integer integer, List<String> names) {
    System.out.println(integer);
    System.out.println(names);
    names.forEach(name -> System.out.println(name));


  }
}


