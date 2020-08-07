package hashmap;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

  int capacity;
  Map<Integer, Node> map;
  Deque<Node> deque;

  public LRUCache(int capacity){
    this.capacity = capacity;
    this.map = new HashMap<>();
    this.deque = new LinkedList<>();
  }


  public void put(int key, int value){

    Node node = new Node(key, value);

    if(deque.size() == this.capacity){
      Node tempnode = deque.pollLast();
      map.remove(tempnode.key);
    }
    if(map.get(key)!=null) deque.remove(key);
    deque.addFirst(node);
    map.put(key, node);
  }

  public void put(int key, int value, long expiryTime){

    Node node = new Node(key, value);

    if(deque.size() == this.capacity){
      Node tempnode = deque.pollLast();
      map.remove(tempnode.key);
    }
    if(map.get(key)!=null) deque.remove(key);
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







  class Node{

    Integer key;
    Integer value;



    Node(Integer key, Integer value){
      this.key = key;
      this.value = value;
    }

  }






  public static void main(String args[]){

    LRUCache cache = new LRUCache(2);
    cache.put(1,1);
    cache.put(2,2);
    cache.put(1,11);
    cache.put(3,3);
    System.out.println(cache.get(2));//return -1
    System.out.println(cache.get(1));//11
    cache.put(4,4);
    System.out.println(cache.get(3));//return -1

  }


}




