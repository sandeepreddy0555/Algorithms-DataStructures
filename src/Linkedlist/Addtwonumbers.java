package Linkedlist;



public class Addtwonumbers {

  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode tempnode = new ListNode();
    ListNode output = tempnode;
    int carry = 0;
    while(l1!=null || l2!=null){
      int l1val = l1!=null ? l1.val:0;
      int l2val = l2!=null ? l2.val:0;
      int sum = l1val+l2val+carry;
      carry = sum/10;
      tempnode.next = new ListNode(sum%10);
      tempnode = tempnode.next;
      if(l1!=null) l1 = l1.next;
      if(l2!=null) l2 = l2.next;
    }

    if(carry ==1)
      tempnode.next = new ListNode(carry);

    return output.next;
  }

}
