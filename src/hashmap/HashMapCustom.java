package hashmap;

import java.util.LinkedList;
import java.util.List;

public class HashMapCustom {


  /**
   * Initialize your data structure here.
   */
  Bucket[] bucketArray;
  int bucketSize;

  public HashMapCustom() {
    this.bucketSize = 769;
    this.bucketArray = new Bucket[bucketSize];
    for (int i = 0; i < bucketSize; i++)
      bucketArray[i] = new Bucket();
  }

  /**
   * value will always be non-negative.
   */
  public void put(int key, int value) {
    int bucketIndex = this.hash(key);
    this.bucketArray[bucketIndex].put(key, value);
  }

  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
   */
  public int get(int key) {
    int bucketIndex = this.hash(key);
    return this.bucketArray[bucketIndex].get(key);
  }

  /**
   * Removes the mapping of the specified value key if this map contains a mapping for the key
   */
  public void remove(int key) {
    int bucketIndex = this.hash(key);
    this.bucketArray[bucketIndex].remove(key);
  }

  public int hash(int key) {
    return key % this.bucketSize;
  }



  class Bucket{

    List<Pair<Integer,Integer>> list;

    public Bucket(){
      this.list = new LinkedList<Pair<Integer,Integer>>();
    }


    public void put(Integer key, Integer value) {
      Pair<Integer,Integer> pair = this.exists(key);
      if(pair!=null) pair.value = value;
      else this.list.add(new Pair(key,value));
    }

    public Pair<Integer,Integer> exists(Integer key){
      for(Pair<Integer,Integer> pair: list){
        if(pair.key.equals(key))
          return pair;
      }
      return null;
    }

    public void remove(Integer key) {
      for(Pair<Integer,Integer> pair: list){
        if(pair.key.equals(key))
          list.remove(pair);
        break;
      }
    }

    public Integer get(Integer key) {
      for(Pair<Integer,Integer> pair: list){
        if(pair.key.equals(key))
          return pair.value;

      }
      return -1;
    }


  }


  class Pair<U,V>{
    U key;
    V value;

    public Pair(U key, V value){
      this.key = key;
      this.value= value;
    }

   /* @Override
    public int hashCode(){
        return Objects.hash(key);
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(this == null || this.getClass() != o.getClass())
            return false;
        Pair pair = (Pair)o;
        return this.key.equals(pair.key);
    }*/


  }



    public static void main(String args[]){
      HashMapCustom map = new HashMapCustom();
      map.put(1,1);
      map.put(2,2);
      map.put(1,2);
      map.remove(1);
      System.out.println(map.get(1));
    }

  }


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */


