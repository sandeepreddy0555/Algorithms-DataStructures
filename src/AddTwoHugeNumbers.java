public class AddTwoHugeNumbers {

  public static void main(String args[]) {

    Node linkLista3 = new Node(1999);
    Node linkLista2 = new Node(5432);
    Node linkLista = new Node(9876);
    linkLista2.next = linkLista3;
    linkLista.next = linkLista2;

    Node linkListb2 = new Node(8001);
    Node linkListb = new Node(1);
    linkListb.next = linkListb2;

    Node result = addTwoHugeNumbers(linkLista, linkListb);

    printList(result);
  }

  public static void printList(Node node) {

    while (node != null) {
      System.out.println(node.data + "\n");
      node = node.next;
    }
  }

  private static Node<Integer> addTwoHugeNumbers(Node<Integer> a, Node<Integer> b) {

    //Determine big and smallNode list. Implement size(list) function.
    Node bigList;
    Node smallList;
    int nodeASize = size(a);
    int nodeBSize = size(b);
    int sizeDifference = Math.abs(nodeASize - nodeBSize);
    if (nodeASize >= nodeBSize) {

      bigList = a;
      smallList = b;
    } else {
      bigList = b;
      smallList = a;
    }

    while (sizeDifference > 0) {
      smallList = addNodeAtHead(smallList, new Node(0000));
      sizeDifference--;
    }

    // Add node to small list at head with value 0000 until the difference of sizes.
    //reverse the linkedlists of small and bignode list. Implement reverse function.
    Node bigListRev = reverse(bigList);
    Node smallListRev = reverse(smallList);
    System.out.println("bigListRev");
    printList(bigListRev);
    System.out.println("smallListRev");
    printList(smallListRev);

    //Add the data, populate carry field by dividing with 10000, Add carry to next iteration if any or else set to 0.
    Node result = null;
    int carry = 0;
    while (bigListRev != null) {
      Integer data = (Integer) bigListRev.data + (Integer) smallListRev.data + carry;
      carry = data / 10000;
      int value = data % 10000;
      Node node = new Node(value);
      result = addNodeAtHead(result, node);
      bigListRev = bigListRev.next;
      smallListRev = smallListRev.next;
    }

    if(carry == 1)
    {
      result = addNodeAtHead(result, new Node(carry));
    }

    //add at tail th results. Implement add at tail.
    return result;
  }

  private static Node reverse(Node node) {

    Node prev = null;
    Node curr = node;
    Node next = node;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  private static int size(Node node) {
    int count = 0;
    while (node != null) {
      node = node.next;
      count++;
    }
    return count;
  }

  private static Node addNodeAtHead(Node targetNode, Node node) {
    Node temp = targetNode;
    targetNode = node;
    targetNode.next = temp;
    return targetNode;
  }

}