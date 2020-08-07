package BST;

public class BinarySearchTreeDeletion {

// Delete node in a BST.
  public TreeNode deleteNode(TreeNode root, int key) {

    if(root == null)
      return null;

    if(root.val > key)
      root.left = deleteNode(root.left, key);
    else if(root.val < key)
      root.right = deleteNode(root.right, key);

    else {

      if(root.left == null && root.right == null){
        root = null;
      }

      else if(root.right!=null){
        TreeNode successorNode = findSuccessor(root);
        root.val = successorNode.val;
        root.right = deleteNode(root.right, successorNode.val);
      }

      else{
        TreeNode predecsorNode = findPredecessor(root);
        root.val = predecsorNode.val;
        root.left = deleteNode(root.left, predecsorNode.val);
      }

    }



    return root;
  }


  public TreeNode findSuccessor(TreeNode root) {
    root = root.right;
    while(root.left!=null){
      root = root.left;
    }
    return root;
  }


  public TreeNode findPredecessor(TreeNode root) {
    root = root.left;
    while(root.right!=null){
      root = root.right;
    }
    return root;
  }

}
