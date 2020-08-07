public class IsPalindrome {



  public static void main(String args[])
  {
    LinkList linkList = new LinkList(1);
    // linkList.addAtHead(10);
    linkList.addAtTail(1000000000);
    linkList.addAtTail(-1000000000);
    linkList.addAtTail(-1000000000);
    linkList.addAtTail(1000000000);
    linkList.addAtTail(1);


   System.out.println( "isPalindrome:" + isPalindrome(linkList));




  }

  private static boolean isPalindrome(LinkList linkList) {

    Node head = linkList.head;


    //Find second half of linked list. Take care of even case and Odd Case.
    //Reverse second half of the original list
    //compare first part and second part. if identical return true else false
    Node secondHalfptr = findSecondHalf(head);
    //linkList.printList(secondHalfptr);
    Node secondHalfRevList = reverseList(secondHalfptr);
    //linkList.printList(secondHalfRevList);
    return compareFirstAndSecondHalfList(head, secondHalfRevList);
  }

  private static boolean compareFirstAndSecondHalfList(Node head, Node secondHalfRevList) {
   while(secondHalfRevList!=null)
   {
     if(head.data.equals(secondHalfRevList.data))
     {
       head = head.next;
       secondHalfRevList = secondHalfRevList.next;
     }
     else
     {
       return false;
     }
   }

    return true;
  }

  private static Node reverseList(Node secondHalfptr) {
    Node prev = null;
    Node curr = secondHalfptr;
    Node next ;

    while(curr != null)
    {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }
    return prev;
  }

  private static Node findSecondHalf(Node head) {
    Node slowptr = head;
    Node  fastptr = head;

    while(fastptr != null && fastptr.next != null)
    {
      slowptr = slowptr.next;
      fastptr = fastptr.next.next;
    }
    if(fastptr != null)
    {
      slowptr = slowptr.next;
    }
    return slowptr;
  }

}
