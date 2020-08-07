package BST;

import java.util.ArrayList;
import java.util.List;

public class narybfs {

  List<List<Integer>> list = new ArrayList<>();
  int level = 0;
  public List<List<Integer>> levelOrder(Node root) {
    return levelorderhelper(root, 0);
  }


  public List<List<Integer>> levelorderhelper(Node root, int level) {

    if(list.size() == level)
      list.add(new ArrayList<Integer>());

    list.get(level).add(root.val);

    for(int i=0;i<root.children.size();i++){
      list = levelorderhelper(root.children.get(i), level+1);
    }

    return list;
  }

}
