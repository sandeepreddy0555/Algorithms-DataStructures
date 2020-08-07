package BST;
//if a node has right node, then for the successor ..you have to go right and traverse left recursively to find the successor.
//if node doesn't have right node, then the sucessor is one of the ancestor...it could be either parent or parentparent...if the node is on the left side it is parent...if the node is on the right side it is parentparent.
public class Successor {

  public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    TreeNode succ = null;
    if(p.right != null)
      return inorderSuccessorhelper(p);
    else{
      while(root != null){
        if(p.val < root.val){
          succ = root;
          root = root.left;

        }else if(p.val > root.val){
          root = root.right;
        }else
          break;

      }
    }
    return succ;

  }


  public TreeNode inorderSuccessorhelper(TreeNode root) {
    root = root.right;
    while(root.left!=null)
      root = root.left;
    return root;
  }

}
