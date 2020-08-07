package BST;

import java.util.ArrayList;
import java.util.List;

public class Preorderrecursive {

  public List<Integer> preorderTraversal(TreeNode root) {
    return preorderTraversalHelper(root, new ArrayList<>());

  }

  public List<Integer> preorderTraversalHelper(TreeNode root, List<Integer> list){
    if(root == null)
      return list;

    list.add(root.val);
    list = preorderTraversalHelper(root.left, list);
    list = preorderTraversalHelper(root.right, list);


    return list;
  }

}
