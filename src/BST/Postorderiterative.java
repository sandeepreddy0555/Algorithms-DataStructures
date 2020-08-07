package BST;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Postorderiterative {


  public List<Integer> postorderTraversal(TreeNode root) {

    LinkedList<Integer> resultList = new LinkedList<>();
    if(root == null)
      return resultList;
    Stack<TreeNode> stack = new Stack();
    stack.add(root);
    while(!stack.isEmpty()){
      TreeNode node = stack.pop();
      resultList.addFirst(node.val);
      if(node.left!=null)
        stack.push(node.left);
      if(node.right!=null)
        stack.push(node.right);
    }

    return resultList;
  }

}
