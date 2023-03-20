import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static int[][] arr;
	static boolean[][] isVisited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0 ,-1, 1};
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		isVisited = new boolean[N][M];
		isVisited[0][0] = true;
		BFS(0, 0);
		System.out.println(arr[N-1][M-1]);
		
		
	}
	
	private static void BFS(int x, int y) {
		Queue<int[]> queue = new LinkedList();
		queue.add(new int[] {x, y});
		
		while(!queue.isEmpty()) {
			int currnode[] = queue.poll();
			int curr_x = currnode[0];
			int curr_y = currnode[1];
			
			for(int i = 0; i < 4; i++) {
				int next_x = curr_x + dx[i];
				int next_y = curr_y + dy[i];
				if(next_x < 0 || next_y <0 || next_x >=N || next_y >=M ) {
					continue;
				}
				if(isVisited[next_x][next_y] || arr[next_x][next_y] == 0){
					continue;
					
				}
				queue.add(new int[] {next_x, next_y});
				arr[next_x][next_y] = arr[curr_x][curr_y] +1;
				
				isVisited[next_x][next_y] = true;
			}
		}
		
	}

}
