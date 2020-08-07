package BST;

import java.util.ArrayList;
import java.util.List;

public class Inorderrecursive {



  public List<Integer> inorderTraversal(TreeNode root) {

    return inorderTraversalHelper(root, new ArrayList<Integer>());

  }

  public List<Integer> inorderTraversalHelper(TreeNode root, List<Integer> list) {

    if(root == null)
      return list;

    list = inorderTraversalHelper(root.left, list);
    list.add(root.val);
    list = inorderTraversalHelper(root.right, list);
    return list;
  }


}
