public class LinkList<T> {

  Node head;

  int counter;

  LinkList(T data) {
    head = new Node(data);
    this.counter = 1;
  }

  public void addAtHead(T data) {
    Node temp = head;
    head = new Node(data);
    head.next = temp;
    counter++;
  }


  public void addAtTail(T data) {
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new Node(data);
    counter ++;
  }


  public void addAtMiddle(int index, T data) {
    if(index <0 || index > counter) {
     System.out.println("cannot add to linked list");
    }
    else
    {
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
        index--;
      }
      Node secondList = temp.next;
      temp.next = new Node(data);
      temp.next.next = secondList;
      counter++;
    }

  }


  public void deleteAtIndex(int index)
  {
    Node temp = head;
   for(int i =0; i<index-1; i++)
    {
       temp = temp.next;
    }
   temp.next = temp.next.next;
    counter --;
  }


  public void printList() {
    Node temp = head;

    while (temp != null) {
      System.out.println(temp.data + "\n");
      temp = temp.next;
    }
    System.out.println(counter);
  }

  public void printList(Node node) {

    while (node != null) {
      System.out.println(node.data + "\n");
      node = node.next;
    }
    System.out.println(counter);
  }

}
