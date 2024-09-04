import java.util.ArrayList;

class Graph{
    int vertices; //number of vertice
    int[][] adjMatrix;
    Graph(int vertices){
      this.vertices=vertices;
      adjMatrix= new int[vertices][vertices];
    }
    void addEdge(int src,int dest){
      adjMatrix[src][dest]=1;
      // adjMatrix[dest][src]=1;
    }
    void printGraph(){
      for(int i[]:adjMatrix){
        for(int j:i){
          System.out.print(j+" ");
        }
        System.out.println();
      }
    }
    void path(int src,int dest){
        for(int i=src;i<vertices;i++){
            if(adjMatrix[src][i]==1)
            {
                System.out.print(src+" -> ");
                path(i,dest);
            }
        }
        System.out.println();
    }

    
  }
  public class Graphpath {
  public static void main(String[] args) {
    Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
    // graph.printGraph();
    graph.path(0, 3);
  }
  }