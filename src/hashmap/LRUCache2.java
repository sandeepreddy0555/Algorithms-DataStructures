package hashmap;

import hashmap.LRUCache2.Node;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class LRUCache2 {


  int capacity;
  Map<Integer, Node> map;
  Deque<Node> deque;

  public LRUCache2(int capacity){
    this.capacity = capacity;
    this.map = new HashMap<>();
    this.deque = new LinkedList<>();
  }


  public void put(int key, int value){

    Node node = new Node(key, value,0);

    if(deque.size() == this.capacity){
      Node tempnode = deque.pollLast();
      map.remove(tempnode.key);
    }
    if(map.get(key)!=null) deque.remove(map.get(key));
    deque.addFirst(node);
    map.put(key, node);
  }


  public void put(int key, int value, long expiryTime){

  Node node = new Node(key, value, System.currentTimeMillis()+expiryTime);

    if(deque.size() == this.capacity){
      Node tempnode = deque.pollLast();
      map.remove(tempnode.key);
    }
    if(map.get(key)!=null) deque.remove(map.get(key));
    deque.addFirst(node);
    map.put(key, node);
  }

  public int get(int key){

    Node node =  map.getOrDefault(key, null);
    if(node!=null){
      deque.remove(node);
      deque.addFirst(node);
    }
    return node != null?node.value:-1;

  }

  public void remove(int key){
    Node node = map.remove(key);
    deque.remove(key);
    System.out.println("key removed:"+node.key);
  }




  class Node{

    Integer key;
    Integer value;
    Long time;

    Node(Integer key, Integer value){
      this.key = key;
      this.value = value;
    }

    Node(Integer key, Integer value, long time){
      this.key = key;
      this.value = value;
      this.time = time;
    }

  /*  public int hashCode(){
      return Objects.hash(key);
    }

    public boolean equals(Object o){
      if(this == o)
        return true;
      if(this == null || this.getClass() != o.getClass())
        return false;
      Node node = (Node) o;
      return this.key.equals(node.key);
    }*/


  }


  static class ChildThread extends Thread{
    LRUCache2 cache;

    ChildThread(LRUCache2 cache){
      this.cache = cache;
    }

    @Override
    public void run(){
      while(true){
       for(Map.Entry<Integer, Node> entry: cache.map.entrySet()){
         long keyDuration = entry.getValue().time;
         if( keyDuration != 0 &&  System.currentTimeMillis() - keyDuration > 0){
          cache.remove(entry.getKey());
          //System.out.println("removed key:"+entry.getKey());
           System.out.println("getting key value after removal :"+cache.get(entry.getKey()));
         }
       }

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }


  public static void main(String args[]){

    LRUCache2 cache = new LRUCache2(2);
    new ChildThread(cache).start();
    /*cache.put(1,1);
    cache.put(2,2);
    cache.put(1,11);
    cache.put(3,3);
    System.out.println(cache.get(2));//return -1
    System.out.println(cache.get(1));//11
    cache.put(4,4);
    System.out.println(cache.get(3));//return -1
*/
 /*   cache.put(1,1, 10);
    System.out.println("**"+cache.get(1));
    System.out.println("**"+cache.get(1));*/

    cache.put(1,1);
    cache.put(1,2);
    System.out.println("**"+cache.get(1));
    System.out.println("**"+cache.get(1));
    System.out.println(cache.deque.size());


  }

}
