import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, totalCnt;
	static int[] s, b;
	static boolean[] isSelected;
	
	static int minResult;
	
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		s = new int[N];
		b = new int[N];
		isSelected = new boolean[N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			s[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());	
		}
		minResult = Math.abs(s[0] - b[0]);
		
		for(int i = 1; i <=N; i++) {
			combi(i, 0, 0);
		}
		System.out.println(minResult);
	}
	
	private static void combi(int r, int start, int cnt) {
		if(r == cnt) {
			int sour = 1;
			int bitter = 0;
			for(int i = 0; i < N; i ++) {
				if(isSelected[i]) {
					sour*= s[i];
					bitter += b[i];
				}
			}
			
			if(Math.abs(bitter - sour) < minResult) {
				minResult = Math.abs(bitter -sour);
			}
			return;
		}
		
		for(int i = start ; i < N; i++) {
			isSelected[i] = true;
			combi(r, i+1, cnt+1);
			isSelected[i] = false;
		}
	}
}
