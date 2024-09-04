import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

class Graph {
    int vertices;
    int [][] adjMat;
   LinkedList<Integer>[] adjList;
    Graph(int vertices){
        this.vertices = vertices;
        adjMat = new int[vertices][vertices];
        adjList=new LinkedList[vertices];  //For  Linked List
        for(int i=0;i<vertices;i++){
            adjList[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int src,int dest){
        adjMat[src][dest]=1;
        // adjMat[dest][src]=1; //uncomment for undirected graph
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjMat[i][j]+" ");
            }
                System.out.println();
        }
    }
    void dfs(int start){
        boolean visited[] = new boolean[vertices];
        // dfsUtilUsingStack(start,visited);
        dfsUtil(start,visited);
    }
    void dfsUtil(int start, boolean[] visited) {
        visited[start]=true;
        System.out.print(start+" ");
        for(int i=0;i<vertices;i++){
            // if(adjMat[start][i]==1 && !visited[i]){  //Adjacenecy Matrix
                if(adjList[start].contains(i) && !visited[i]){  //Adjacency List
                dfsUtil(i,visited); 
            }
        }
    }
    void dfsUtilUsingStack(int start, boolean[] visited) {
        Stack<Integer> stack=new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            int vertice=stack.pop();
        visited[vertice]=true;
        System.out.print(vertice+" ");
        for(int i=0;i<vertices;i++){
            if(adjMat[vertice][i]==1 && !visited[i]){
                stack.push(i);
                break;
            }
        }
    }
}

//
    void bfs(int start){
        boolean visited[]=new boolean[vertices];
        Queue<Integer> q=new LinkedList<Integer>();
        visited[start]=true;
        q.add(start);
        while(!q.isEmpty()){
            start=q.poll();
            System.out.print(start+" ");
            // for(int i=0;i<vertices;i++){ //Adjacency matrix
                // if(!visited[i] && adjMat[start][i]==1){
                for(int AdjVert:adjList[start]){  //Adjacency List
                if(adjList[start].contains(AdjVert) && !visited[AdjVert]){  //Adjacency List
                    visited[AdjVert]=true;
                    q.add(AdjVert);
                }
            }
    }
    }

    void addLL(int src,int dest){
        adjList[src].addFirst(dest);
        // adjList[dest].addFirst(src); //necessary if it is a undirected graph
    }
static ArrayList<ArrayList<Integer>> allPaths=new ArrayList<>();
static int min=Integer.MAX_VALUE; //min distance from source to destination
    void printAllPaths(int src,int dest){
        boolean visited[]=new boolean[vertices];
        ArrayList<Integer> paths=new ArrayList<>();
        paths.add(src);
        findPath(src,dest,visited,paths);
      }
      void findPath(int src, int dest, boolean[] visited, ArrayList<Integer> paths) {
        if(src==dest){
            if(paths.size()<min) 
            min=paths.size();
            System.out.println(paths);
            return;
        }
        visited[src]=true;
        for(int adjNode:adjList[src]){
            if(!visited[adjNode]){
                paths.add(adjNode);
                findPath(adjNode,dest,visited,paths);
                paths.remove(paths.size()-1);
                }
                }
                visited[src]=false;
            }

    public int findShortestDistance(int src,int dest){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[vertices];
        int distance[]=new int[vertices];
        distance[src]=0;
        visited[src]=true;
        q.add(src);
        while(!q.isEmpty()){
            src=q.poll();
            for(int adjNode:adjList[src]){
                if(!visited[adjNode]){
                    distance[adjNode]=distance[src]+1;
                    visited[adjNode]=true;
                    q.add(adjNode);
                    if(adjNode==dest) return distance[adjNode];
                }
            }
        }
        return -1;
    }
}
public class GraphMain{
    public static void main(String[] args) {
        Graph g=new Graph(6);
        // g.addEdge(0, 1);
        // g.addEdge(0, 2);
        // g.addEdge(1, 2);
        // g.addEdge(1, 3);
        // g.addEdge(2, 5);
        // g.addEdge(3, 2);
        // g.addEdge(4, 3);
        // g.addEdge(5, 4);
        g.addLL(0, 1);
        g.addLL(0, 2);
        g.addLL(1, 2);
        g.addLL(1, 3);
        g.addLL(2, 5);
        g.addLL(3, 2);
        g.addLL(4, 3);
        g.addLL(5, 4);

        // g.printGraph();
        // g.dfs(0);
        // for(LinkedList<Integer> i:g.adjList)
        // System.out.println(i);
        // g.bfs(0);
        // g.printAllPaths(0, 5);
        // System.out.println(g.min);
        // for(int i=0;i<5;i++)
        // System.out.println(g.findShortestDistance(i, 5));
    }
}
