package BST;

import java.util.ArrayList;
import java.util.List;

public class Levelorderlist {
  List<List<Integer>> resultList = new ArrayList<>();
  public List<List<Integer>> levelOrder(TreeNode root) {

    return levelOrderHelper(root, 0);
  }

  public List<List<Integer>> levelOrderHelper(TreeNode root, int levelOrder) {

    if(root == null)
      return resultList;


    if(resultList.size() == levelOrder)
      resultList.add(new ArrayList<Integer>());

    resultList.get(levelOrder).add(root.val);

    resultList = levelOrderHelper(root.left, levelOrder+1);
    resultList = levelOrderHelper(root.right, levelOrder+1);

    return resultList;
  }
}
