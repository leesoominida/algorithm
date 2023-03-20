import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static ArrayList<Integer>[] adjList;
	static boolean[] isVisited;
	static int result = 0;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[N];
		isVisited = new boolean[N+1];
		
		for(int i = 0; i < N; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			adjList[a].add(b);
			adjList[b].add(a);
		}
		
		for(int i = 0; i < N; i++) {
			isVisited[i] = true;
			DFS(i, 0);
			isVisited[i] = false;
			if(result == 1) {
				break;
			}
		}
		System.out.println(result);
		

	}
	
	private static void DFS(int currNode, int cnt) {
		if(cnt >= 4) {
			result = 1;
			return;
		}
		
		for(int node : adjList[currNode]) {
			if(!isVisited[node]) {
				isVisited[node] = true;
				
				DFS(node, cnt+1);
				isVisited[node] = false;
			} 
			
		}
		
	}

}