package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderListiterative {

  List<List<Integer>> resultList = new ArrayList<>();
  public List<List<Integer>> levelOrder(TreeNode root) {
    if(root == null)
      return resultList;

    Queue<TreeNode> q = new LinkedList<>();
    int level = 0;
    q.add(root);

    while(!q.isEmpty()){

      resultList.add(new ArrayList<>());
      int qsize = q.size();
      for(int i=0; i<qsize;i++){
        TreeNode node = q.poll();
        resultList.get(level).add(node.val);
        if(node.left!=null) q.add(node.left);
        if(node.right!=null) q.add(node.right);

      }
      level++;

    }

    return resultList;
  }

}
