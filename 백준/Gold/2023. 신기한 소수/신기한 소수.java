import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		DFS("",0);
		System.out.println(sb.toString());
		
		
	}
	
	private static void DFS(String s, int cnt) {
		if(cnt == N) {
			sb.append(s + "\n");
			return;
		}
		for(int i = 1; i <= 9; i++) {
			if(isPrime(Integer.parseInt(s+i))) {
				DFS(s+i, cnt+1);
			}
		}
	}
	
	
	private static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i =2; i <=(int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
