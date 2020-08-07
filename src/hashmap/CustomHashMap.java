package hashmap;

public class CustomHashMap<K, V> {


  Entry[] entries;

  CustomHashMap() {
    entries = new Entry[16];
  }

  public void put(K key, V value) {
    //calculate hash code of key and then calcualte hash to determine the bucket location then traverse the linke list to see if the keys are equal if equal then overide, if not
    //append to the node
    int hash = key.hashCode() & (entries.length - 1);
    Entry entry = entries[hash];

    if (entry == null) {
      entry = new Entry(key.hashCode(), key, value, null);

    } else {
      while (entry.next != null) {

        if (entry.hashcode == key.hashCode()) {
          if (entry.key.equals(key)) {
            entry.value = value;
            return;
          }

        }
        entry = entry.next;
      }

      if (entry.hashcode == key.hashCode() && entry.key.equals(key)) {
        entry.value = value;
        return;
      }

      entry.next = new Entry(hash, key, value, null);


    }

   // entries[hash] = entry;


  }

 /* public V get(K key) {

  }*/


  public void printKeyAndValues()
  {
    for(int i=0; i<=entries.length-1; i++)
    {
      Entry entry = entries[i];
      while(entry != null) {
        System.out.println("entry key:"+ entry.getKey() + "entry value:"+ entry.getValue());
        entry = entry.next;
      }

    }
  }


  public static void main(String args[]) {

    CustomHashMap customHashMap = new CustomHashMap();
    customHashMap.put("san", 1);
    customHashMap.put("ans", 1);
    customHashMap.put("anu", 2);
    customHashMap.put("san", 2);

    customHashMap.printKeyAndValues();



  }

}
