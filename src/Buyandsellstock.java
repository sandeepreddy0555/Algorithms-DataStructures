import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Buyandsellstock {


  public static class Stock {

    Stock(int minIndex, int maxIndex) {
      this.minIndex = minIndex;
      this.maxIndex = maxIndex;
    }

    int minIndex;
    int maxIndex;

    public int getMinIndex() {
      return minIndex;
    }

    public void setMinIndex(int minIndex) {
      this.minIndex = minIndex;
    }
  }


  public static void main(String args[]) {

    int stocks[] = {100, 180, 260, 310, 40, 535, 695};
    Map<Integer, List<Stock>> resultMap = new TreeMap<>();

    for (int i = 0; i <= stocks.length - 1; i++) {


      for (int j = i +1; j <= stocks.length - 1; j++) {

        Integer profitKey = Integer.valueOf(stocks[j] - stocks[i]);
        List<Stock> stocksbykey = new ArrayList<>();
        Stock stock = new Stock(i, j);
        if (resultMap.containsKey(profitKey)) {
          stocksbykey = resultMap.get(profitKey);
          stocksbykey.add(stock);
          resultMap.put(profitKey, stocksbykey);
        } else {
          stocksbykey.add(stock);
          resultMap.put(profitKey, stocksbykey);
        }

      }

    }

      ((TreeMap<Integer, List<Stock>>) resultMap).lastEntry().getValue().forEach(stock -> System.out
        .println("Buy stock at " + stocks[stock.minIndex] +" and  sell at "  + stocks[stock.maxIndex]));


  }


}
