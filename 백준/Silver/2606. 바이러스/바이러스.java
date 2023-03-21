import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, cnt;
	static ArrayList<Integer>[] arr;
	static boolean[] isVisited;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[N + 1];
		isVisited = new boolean[N+1];
		for(int i = 1; i <= N; i++) {
			arr[i] = new ArrayList();
		}
		StringTokenizer st;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			arr[from].add(to);
			arr[to].add(from);
		}
		
		BFS(1);
		
	}
	
	private static void BFS(int startNode) {
		Queue<Integer> q = new LinkedList();
		q.offer(startNode);
		
		isVisited[startNode] = true;
		
		while(!q.isEmpty()) {
			int currNode = q.poll();
			//System.out.print(currNode);
			cnt++;
			for(int n : arr[currNode]) {
				if(!isVisited[n]) {
					q.offer(n);
					isVisited[n] = true;
				}
			}
		}
		System.out.println(cnt-1);
	}

}