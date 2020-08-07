package BST;

public class SymmetricTree {


  public boolean isSymmetric(TreeNode root) {
    if(root == null)
      return true;
    return isSymmetricHelper(root.left, root.right);
  }

  public boolean isSymmetricHelper(TreeNode tree1, TreeNode tree2){

    if(tree1 == null && tree2 == null)
      return true;
    if(tree1 == null || tree2 == null)
      return false;
    return tree1.val == tree2.val && isSymmetricHelper(tree1.left, tree2.right) && isSymmetricHelper(tree1.right, tree2.left);
  }

}
