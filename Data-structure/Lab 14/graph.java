import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class graph {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    public static void main(String[] args) {
        graph graph = new graph();
        graph.addEdge(1, 2, false);
        graph.addEdge(2, 3, false);
        graph.addEdge(3, 1, false);        

        for (int n : graph.map.keySet()) {
            System.out.println(n+" "+graph.map.get(n));
        }
        System.out.println();
        System.out.print("BFS: ");
        graph.bfs(1);
        System.out.println();
        System.out.print("DFS: ");
        graph.dfs(1);
    }    

    public void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Boolean> visited = new HashMap<>(); 

        q.add(start);
        visited.put(start, true);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u+" ");
            for (int neighbour : map.get(u)) {
                if (!visited.getOrDefault(neighbour, false)) {
                    q.add(neighbour);
                    visited.put(neighbour, true);
                }
            }
        }
    }

    public void dfs(int start){
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Boolean> visited = new HashMap<>(); 

        s.push(start);
        visited.put(start, true);   

        while (!s.isEmpty()) {
            int u = s.pop();
            System.out.print(u+" ");
            for (int neighbour : map.get(u)) {
                if (!visited.getOrDefault(neighbour, false)) {
                    s.push(neighbour);
                    visited.put(neighbour, true);
                }
            }
        }
    }

    public void addEdge(int u, int v, boolean direction) {
        if (!map.containsKey(u)){
            map.put(u, new ArrayList<>());
        }
        map.get(u).add(v);

        if(!direction){
            if (!map.containsKey(v)){
            map.put(v, new ArrayList<>());
        }
        map.get(v).add(u);
        }
    }
}
