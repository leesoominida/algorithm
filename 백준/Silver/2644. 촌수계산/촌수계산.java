import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, a, b, M, cnt;
	static int result = -1;
	static ArrayList<Integer>[] arr;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N =  Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[N+1];
		
		isVisited = new boolean[N+1];
		
		for(int i = 1; i <=N; i++) {
			arr[i] = new ArrayList();
		}

		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			arr[from].add(to);
			arr[to].add(from);
		}
		
		DFS(a, b, 0);
		System.out.println(result);

		
	}
	
	private static void DFS(int start, int end, int depth) {
		if(start == end) {
			result = depth;
			return;
		}
		
		isVisited[start] = true;
		for(int i = 0; i < arr[start].size(); i++) {
			int next = arr[start].get(i);
			if(!isVisited[next]) {
				DFS(next, end, depth+1);
			}
		}
		
		
	}

}
