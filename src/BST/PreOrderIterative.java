package BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {

  public List<Integer> preorderTraversal(TreeNode root) {


    List<Integer> list = new ArrayList<>();

    if(root == null)
      return list;

    Stack<TreeNode> stack = new Stack<TreeNode>();

    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode poppedNode = stack.pop();
      list.add(poppedNode.val);
      if(poppedNode.right!=null)
        stack.push(poppedNode.right);
      if(poppedNode.left!=null)
        stack.push(poppedNode.left);

    }


    return list;
  }


}
