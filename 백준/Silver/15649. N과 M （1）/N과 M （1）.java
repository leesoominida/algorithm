import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[] nums;
	static boolean[] isSelected;
	static int N, M;
	static int totalCnt;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[M];
		isSelected = new boolean[N+1];
		
		perm(0);
	}
	
	private static void perm(int n) {
		if(n == M ) {
			totalCnt++;
			
			for(int i = 0; i < n; i++) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1; i < N+1; i++) {
			if(isSelected[i] == true) {
				continue;
			}
			
			nums[n] = i;
			isSelected[i] = true;
			perm(n+1);
			isSelected[i] = false;
		}
		
	}

}