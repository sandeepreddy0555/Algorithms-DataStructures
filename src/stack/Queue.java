package stack;

public class Queue {

  int[] arr;
  int front;
  int rear;
  Queue() {
    arr = new int[32];
    front = 0;
    rear = 0;
  }

  public void enqueue(int element) {

    if(rear <= arr.length -1){
      arr[rear] = element;
      rear++;
    }
    else{
      System.out.println("queue is full cannot enquue");
    }

  }


  public int dequeue() {

    if(front == rear)
    {
      System.out.println("cannot dequew as Q is empty");
    }
    else {
      int element = arr[front];
      for(int i=0; i<rear; i++)
      {
        arr[i] = arr[i+1];
      }
      rear--;
      System.out.println("dequue element:" + element);
      return element;

    }
    return 0;
  }



  public void printqueue() {

    if(rear == front)
    {
      System.out.println("nothing to print");
    }
    else {
      System.out.println("printing elements:");
      for(int i=0; i<=rear-1; i++){
        System.out.print(arr[i]+"-->");
      }
    }




  }



  public static void main(String args[]) {

    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.printqueue();
    queue.dequeue();
    queue.dequeue();
    queue.printqueue();

  }

}
