package stack;

//stack using arrays
public class Stack {


  int[] arr;
  int top;

  Stack(){
    arr = new int[32];
    top = -1;
  }

  public void push(int number){

    if(top <= arr.length -1){
      top ++;
      arr[top] = number;
    }
    else {
      System.out.println("reached max size cannot push");
      return;
    }

  }


  public int pop(){

    if(!isEmpty()){
      int poppedElement =  arr[top];
      System.out.println("popped element " + poppedElement);
      top--;
      return poppedElement;
    }
    else{
      System.out.println("cannot pop stack is empty" );
    }
    return 0;
  }


  public boolean isEmpty() {
    return top == -1;
  }

  public void printStack(){
    System.out.println("printing stack:");
    for(int i=0; i<=top;i++){
      System.out.print(arr[i]+"-->");
    }
    System.out.print("\n");

  }







  public static void main(String args[]){

    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.printStack();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.printStack();

  }

}
