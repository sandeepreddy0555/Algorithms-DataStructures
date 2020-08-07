package goldman;

import java.util.ArrayList;
import java.util.List;


///this can solve both the problems of  max profit  in the given window , total profit in the given window
//Example
//    Input:
//    2
//    7
//    100 180 260 310 40 535 695
//    10
//    23 13 25 29 33 19 34 45 65 67
//    Output:
//    (0 3) (4 6)
//    (1 4) (5 9)
// find list of indexes of buy and sell in the given length to earn more profit.
class Buyandsellshares {

  public static void stockBuySell(int[] stocks) {

    if(stocks. length < 2) {
      System.out.println("no profit");
    }


    List<Integer> buyIndexList = new ArrayList<>();
    List<Integer> sellIndexList = new ArrayList<>();


    buyIndexList.add(0);
    int maxProfit = Integer.MIN_VALUE;
    int buyIndex = -1;
    int sellIndex = -1;

    for(int i=1; i<stocks.length; i++) {

      if(stocks[i-1] > stocks[i]) {
        sellIndexList.add(i-1);
        if( stocks[sellIndexList.get(sellIndexList.size() -1)] - stocks[buyIndexList.get(sellIndexList.size() -1)]  > maxProfit ) {
          maxProfit = stocks[sellIndexList.get(sellIndexList.size() -1)] - stocks[buyIndexList.get(sellIndexList.size() -1)];
          buyIndex =  buyIndexList.get(sellIndexList.size() -1);
          sellIndex = sellIndexList.get(sellIndexList.size() -1);
        }
        buyIndexList.add(i);
      }


      if( i== stocks.length-1){
        sellIndexList.add(i);
        if( stocks[sellIndexList.get(sellIndexList.size() -1)] - stocks[buyIndexList.get(sellIndexList.size() -1)]  > maxProfit ) {
          maxProfit = stocks[sellIndexList.get(sellIndexList.size() -1)] - stocks[buyIndexList.get(sellIndexList.size() -1)];
          buyIndex =  buyIndexList.get(sellIndexList.size() -1);
          sellIndex = sellIndexList.get(sellIndexList.size() -1);
        }

      }



    }


    for(int i=0;i<sellIndexList.size(); i++)
    {
      if( buyIndexList.get(i) != sellIndexList.get(i)) {

        System.out.println("buy:"+buyIndexList.get(i) + "sell:"+ sellIndexList.get(i));

      }
    }


    if(maxProfit > 0) {
      System.out.println("buy:"+buyIndex+ "sell:"+ sellIndex + "maxprofit:" + maxProfit);
    }

    else {
      System.out.println("no profit");
    }


  }

  public static void main(String[] args) {

    int[] stocks = {2,4,1};

    stockBuySell(stocks);


  }



}