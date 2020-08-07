package BST;

import java.util.ArrayList;
import java.util.List;

public class Narypreorder {

  List<Integer> list = new ArrayList<>();
  public List<Integer> preorder(Node root) {

    if(root == null)
      return list;

    list.add(root.val);
    for(int i=0;i<root.children.size();i++){
      list = preorder(root.children.get(i));
    }

    return list;
  }

}
