package BST;

import java.util.ArrayList;
import java.util.List;

public class Narypostorder {

  List<Integer> list = new ArrayList<>();
  public List<Integer> postorder(Node root) {
    if(root == null)
      return list;
    for(int i=0;i<root.children.size();i++){
      list = postorder(root.children.get(i));
    }
    list.add(root.val);

    return list;
  }
}
