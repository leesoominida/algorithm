import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, totalCnt;
	static int[] nums, arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[M];
		
		combi(0,0);
		

	}
	
	private static void combi(int cnt, int s) {
		if(cnt == M) {
			totalCnt++;
			for(int i = 0; i <cnt ; i++) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = s; i < N; i++) {
			nums[cnt] = i+1;
			combi(cnt+1, i+1);
			
		}
	}

}
