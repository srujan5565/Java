import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class Graph {
    int vertices;
    int[][] adjMatrix;
    LinkedList<Integer>[] adjList;
    static ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
    static int minPathLength = Integer.MAX_VALUE;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjMatrix = new int[vertices][vertices];
        this.adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            this.adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        this.adjMatrix[src][dest] = 1;
    }

    void printGraph() {
        for (int i = 0; i < this.vertices; i++) {
            for (int j = 0; j < this.vertices; j++) {
                System.out.print(this.adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void dfs(int startVertex) {
        boolean[] visited = new boolean[this.vertices];
        dfsUtil(startVertex, visited);
    }

    void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < this.vertices; i++) {
            if (this.adjList[vertex].contains(i) && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    void dfsUtilUsingStack(int startVertex, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            visited[vertex] = true;
            System.out.print(vertex + " ");

            for (int i = 0; i < this.vertices; i++) {
                if (this.adjMatrix[vertex][i] == 1 && !visited[i]) {
                    stack.push(i);
                    break;
                }
            }
        }
    }

    void bfs(int startVertex) {
        boolean[] visited = new boolean[this.vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            startVertex = queue.poll();
            System.out.print(startVertex + " ");
            Iterator<Integer> iterator = this.adjList[startVertex].iterator();

            while (iterator.hasNext()) {
                int neighbor = iterator.next();
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    void addEdgeToAdjList(int src, int dest) {
        this.adjList[src].addFirst(dest);
    }

    void printAllPaths(int startVertex, int endVertex) {
        boolean[] visited = new boolean[this.vertices];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(startVertex);
        findPath(startVertex, endVertex, visited, pathList);
    }

    void findPath(int currentVertex, int endVertex, boolean[] visited, ArrayList<Integer> pathList) {
        if (currentVertex == endVertex) {
            if (pathList.size() < minPathLength) {
                minPathLength = pathList.size();
            }
            System.out.println(pathList);
        } else {
            visited[currentVertex] = true;
            Iterator<Integer> iterator = this.adjList[currentVertex].iterator();

            while (iterator.hasNext()) {
                int nextVertex = iterator.next();
                if (!visited[nextVertex]) {
                    pathList.add(nextVertex);
                    findPath(nextVertex, endVertex, visited, pathList);
                    pathList.remove(pathList.size() - 1);
                }
            }
            visited[currentVertex] = false;
        }
    }

    public int findShortestDistance(int startVertex, int endVertex) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[this.vertices];
        int[] distances = new int[this.vertices];
        distances[startVertex] = 0;
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            Iterator<Integer> iterator = this.adjList[currentVertex].iterator();

            while (iterator.hasNext()) {
                int nextVertex = iterator.next();
                if (!visited[nextVertex]) {
                    distances[nextVertex] = distances[currentVertex] + 1;
                    visited[nextVertex] = true;
                    queue.add(nextVertex);
                    if (nextVertex == endVertex) {
                        return distances[nextVertex];
                    }
                }
            }
        }

        return -1;
    }
}
