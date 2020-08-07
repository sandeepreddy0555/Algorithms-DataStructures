package hashmap;

public class Entry<K, V> {

  K key;
  V value;
  int hashcode;
  Entry<K, V> next;

  Entry(int hashcode,  K key, V value, Entry<K, V> next)
  {
    this.key = key;
    this.value = value;
    this.hashcode = hashcode;
    this.next = next;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }


  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public int getHashcode() {
    return hashcode;
  }

  public void setHashcode(int hashcode) {
    this.hashcode = hashcode;
  }

  public Entry<K, V> getNext() {
    return next;
  }

  public void setNext(Entry<K, V> next) {
    this.next = next;
  }
}
