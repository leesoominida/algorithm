import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0,0,-1,1,-1,1,-1,1};
	static int[] dy = {-1,1,0,0,1,1,-1,-1};
	static int w, h, currX, currY;
	
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String str = " ";
		while( !(str = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(str);
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			arr = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int result = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(!visited[i][j] && arr[i][j] == 1) {
						result++;
						DFS(i, j);
					}
				}
			}
			System.out.println(result);
					
		}
		
		

	}
 	
 	private static void DFS(int x, int y) {
 		visited[x][y] = true;
 		
 		for(int i = 0; i < 8; i++) {
 			currX = x + dx[i];
 			currY = y + dy[i];
 			
 			if(currX >= 0 && currX < h && currY >=0 && currY < w && arr[currX][currY] == 1 && !visited[currX][currY]) {
 				DFS(currX, currY);
 			}
 		}
 		
 	}

}