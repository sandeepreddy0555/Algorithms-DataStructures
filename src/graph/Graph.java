package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//DFS graph
public class Graph {

  int vertexCount;
  List<Integer> adj[];
  boolean visited[];


  Graph(int vertexCount)
  {
    this.vertexCount = vertexCount;
    this.adj = new ArrayList[vertexCount];
     for(int i=0; i< vertexCount; i++) {
       this.adj[i] = new ArrayList<Integer>();

     }
    visited = new boolean[this.vertexCount];

  }


  public void addEdge(int vertex, int neighbour) {

    adj[vertex].add(neighbour);
  }


  public void DFS(int vertex) {

    visited[vertex] = true;

    System.out.println(vertex);

    for(int i=0; i<adj[vertex].size(); i++) {


       if(!visited[adj[vertex].get(i)])
          DFS(adj[vertex].get(i));

    }

  }


  public void BFS(int vertex) {
    List<Integer> queue = new LinkedList<>();
    queue.add(vertex);

    while(!queue.isEmpty()){
      Integer visitedNode = ((LinkedList<Integer>) queue).poll();
      System.out.println(visitedNode);
      visited[visitedNode] = true;
      for(int i=0;i<adj[visitedNode].size();i++){
        Integer neighbournode = adj[visitedNode].get(i);
        if(!visited[neighbournode])
          queue.add(neighbournode);

      }

    }


  }




  public static void main(String args[]) {

    Graph g = new Graph(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    //g.DFS(2);
    g.BFS(2);

  }


}
