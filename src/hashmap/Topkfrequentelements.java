package hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Topkfrequentelements {


  public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int num:nums) map.put(num, map.getOrDefault(num,0)+1);
    Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>(){
      @Override
      public int compare(Integer num1, Integer num2){
        return map.get(num1).compareTo(map.get(num2));
      }
    });

    for(Integer key : map.keySet()){
      q.add(key);
      if(q.size() > k) q.poll();
    }

    int[] result = new int[q.size()];
    for(int i=0;i<q.size();i++){
      result[i] = q.poll();
    }
    return result;
  }



  public static void main(String args[]){

    topKFrequent(new  int[] {1,1,1,2,2,3}, 2);
  }

}
