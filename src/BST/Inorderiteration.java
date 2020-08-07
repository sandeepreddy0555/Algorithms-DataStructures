package BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inorderiteration {

  public List<Integer> inorderTraversal(TreeNode root) {

    List<Integer>  resultList = new ArrayList<>();
    Stack<TreeNode> stack = new Stack();
    TreeNode curr = root;
    while( curr!= null || !stack.isEmpty()){

      while(curr!=null){
        stack.push(curr);
        curr = curr.left;
      }
      TreeNode poppedNode = stack.pop();
      resultList.add(poppedNode.val);
      curr = poppedNode.right;

    }

    return resultList;
  }


}
