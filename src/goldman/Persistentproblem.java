package goldman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Persistentproblem {

   static class Feed {

    String companyName;
    Double price;
    Integer time;

  }


  public static List<String> companyList(List<Feed> feeds){

    List<String> companiesList = new ArrayList<>();

    //hashmap with companyname+price as key, list of feed as value
    //iterate through hashmap , get size of the value(list), if < 3 continue, if > 3 get 1st and  //2nd objects in the list get the diff , comapre the diff with 2nd, 3rd .. in the list of objects if equal add to the companiesList

    Map<String, List<Feed>> feedMap = new HashMap<>();

    for(Feed feed : feeds) {
      String key = feed.companyName + feed.price.toString();
      if(feedMap.containsKey(key)) {
        List<Feed> comapanyFeedList  = feedMap.get(key);
        comapanyFeedList.add(feed);
        feedMap.put(key, comapanyFeedList);

      }
      else{
        List<Feed> comapanyFeedList  = new ArrayList<>();
        comapanyFeedList.add(feed);
        feedMap.put(key, comapanyFeedList);
      }

    }


    for(Entry<String, List<Feed>> entry: feedMap.entrySet()){

      List<Feed> uniqueCompanyList = entry.getValue();

      if(uniqueCompanyList.size() <= 2){
        continue;
      }

      Integer intervalDiff = uniqueCompanyList.get(1).time - uniqueCompanyList.get(0).time;
      int count =1;
      for(int i=2; i<=uniqueCompanyList.size()-1; i++) {

        if(intervalDiff.equals(uniqueCompanyList.get(i).time - uniqueCompanyList.get(i-1).time))
        {
          count++;
          if(count == 2) {
            companiesList.add(uniqueCompanyList.get(i).companyName);
            break;
          }

        }

      }

    }

    return companiesList;
  }


  public static void main(String[] args) {


    List<Feed> feeds = new ArrayList<>();

    Feed feed1 = new Feed();
    feed1.companyName = "Whole Foods";
    feed1.price = 48.11;
    feed1.time = 5;

    Feed feed2 = new Feed();
    feed2.companyName = "Comcast";
    feed2.price = 89.99;
    feed2.time = 10;


    Feed feed3 = new Feed();
    feed3.companyName = "Comcast";
    feed3.price = 89.99;
    feed3.time = 20;


    Feed feed4 = new Feed();
    feed4.companyName = "Comcast";
    feed4.price = 89.99;
    feed4.time = 30;

    Feed feed5 = new Feed();
    feed5.companyName = "Comcast";
    feed5.price = 89.99;
    feed5.time = 40;


    feeds.add(feed1);
    feeds.add(feed2);
    feeds.add(feed3);
    feeds.add(feed4);
    feeds.add(feed5);


    //Persistentproblem.companyList(feeds).forEach(string -> System.out.println(string));


  }


}
