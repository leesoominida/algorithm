import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int parents[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		parents = new int[N+1];
		for (int i = 1;  i < N+1; i++) {
			parents[i] = i;
		}
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				int a = Integer.parseInt(st.nextToken());
				if(a == 1) {
					union(i, j);
				}
			}
		}
		
		
		st = new StringTokenizer(br.readLine());
		int from = find(Integer.parseInt(st.nextToken()));
		for(int i = 1; i < M; i++) {
			int to = Integer.parseInt(st.nextToken());
			if( from != find(to)) {
				System.out.println("NO");
				return;
			}
			
		}
		System.out.println("YES");

	}
	
	static int find(int x) {
		if(parents[x] == x) return x;
		
		return parents[x] = find(parents[x]);
	}
	
	static void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		
		if(xRoot != yRoot) {
			if(x < y) {
				parents[yRoot] = xRoot;
			}
			else {
				parents[xRoot] = yRoot;
			}
		}
	}

	
}
