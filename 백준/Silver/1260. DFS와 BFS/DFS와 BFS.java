import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, V;
	static ArrayList<Integer>[] arr;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[N+1];
		isVisited = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = new ArrayList(); 
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			arr[from].add(to);
			arr[to].add(from);
		}
		
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(arr[i]);
		}
		
		
		DFS(V);
		isVisited = new boolean[N+1];
		System.out.println();
		BFS(V);
	}
	
	private static void DFS(int currNode) {
		System.out.print(currNode + " ");
		isVisited[currNode] = true;
		for(int node : arr[currNode]) {
			if(!isVisited[node]) {
				//isVisited[node] = true;
				DFS(node);
			}
		}
	}
	
	private static void BFS(int startNode) {
		Queue<Integer> q = new LinkedList();
		q.offer(startNode);
		isVisited[startNode] = true;
		while(!q.isEmpty()) {
			int currNode = q.poll();
			System.out.print(currNode + " ");
			for(int n : arr[currNode]) {
				if(!isVisited[n]) {
					q.offer(n);
					isVisited[n] = true;
				}
			}
		}
	}

}
