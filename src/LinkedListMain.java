public class LinkedListMain {

  public static  void main(String args[])
  {

    LinkList linkList = new LinkList(20);
   // linkList.addAtHead(10);
    linkList.addAtTail(30);
    linkList.addAtTail(50);
   // linkList.addAtMiddle(10, 80);
   // linkList.deleteAtIndex(2);


    linkList.printList();
  }

}
