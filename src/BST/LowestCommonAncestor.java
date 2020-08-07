package BST;

public class LowestCommonAncestor {

  TreeNode node = null;
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    lowestCommonAncestorhelper(root, p , q);
    return node;
  }

  public boolean lowestCommonAncestorhelper(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null)
      return false;

    int a = lowestCommonAncestorhelper(root.left,p,q)?1:0;
    int b = lowestCommonAncestorhelper(root.right,p,q)?1:0;
    int mid = root.val == p.val || root.val == q.val?1:0;
    if(a+b+mid == 2)
      this.node = root;
    return a+b+mid>=1;


  }

}
