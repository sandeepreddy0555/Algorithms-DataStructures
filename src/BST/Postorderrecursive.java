package BST;
import java.util.ArrayList;
import java.util.List;

public class Postorderrecursive {
  public List<Integer> postorderTraversal(TreeNode root) {

    return postorderTraversalHelper(root, new ArrayList<>());
  }

  public List<Integer> postorderTraversalHelper(TreeNode root, List<Integer> list) {
    if(root == null)
      return list;

    list = postorderTraversalHelper(root.left, list);
    list = postorderTraversalHelper(root.right, list);
    list.add(root.val);
    return list;

  }
}
