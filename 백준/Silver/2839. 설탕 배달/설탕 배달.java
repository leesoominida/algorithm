import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N % 5 == 0) {
			System.out.println(N/5);
		}
		else {
			int cnt = 0;
			while( N >0) {
				N = N-3;
				cnt++;
				
				if(N%5 ==0)
				{
					cnt +=  (N/5);
					System.out.println(cnt);
					break;
				}
				
				
				else if(N ==1 || N ==2) {
					System.out.println(-1);
					break;
				}
				else if(N ==0) {
					System.out.println(cnt);
					break;
				}
			}
		}
		

	}

}
