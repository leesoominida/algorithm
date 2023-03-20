import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static int N, E;
	static ArrayList<Integer>[] adjList;
	static boolean[] isVisited;
	static int result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[N+1];
		isVisited = new boolean[N+1];
		
		for(int i = 1; i < N+1; i++) {
			adjList[i] = new ArrayList();
		}
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			adjList[from].add(to);
			adjList[to].add(from);
		}
		
		int result= 0;
		for(int i = 1; i < N+1; i++) {
			if(!isVisited[i]) {
				result++;
				DFS(i);
			}
		}
		System.out.println(result);
		
	}
	
	private static void DFS(int currNode) {
		for(int node : adjList[currNode]) {
			if(!isVisited[node]) {
				isVisited[node] = true;
				DFS(node);
			} 
		}
	}

}
