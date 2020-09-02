package BST;

public class ValidBST {

  Long prev = Long.MIN_VALUE;

  //inorder traversal
  public boolean isValidBST(TreeNode root) {
    if(root != null){
      if(!isValidBST(root.left))
        return false;
      if(prev >= root.val)
        return false;
      prev = Long.valueOf(root.val);
      return isValidBST(root.right);
    }
    return true;
  }

}
