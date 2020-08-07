package BST;

public class HasPathSum {

  public boolean hasPathSum(TreeNode root, int sum) {

    return hasPathSum(root, sum, 0);

  }

  public boolean hasPathSum(TreeNode root, int sum, int curr) {

    if(root == null)
      return false;

    curr = curr+root.val;

    if(root.left == null && root.right == null){
      if(curr == sum)
        return true;
      else
        curr = curr - root.val;
    }

    return hasPathSum(root.left, sum, curr) || hasPathSum(root.right, sum, curr);


  }

}
