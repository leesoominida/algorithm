import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s  = br.readLine();
		int q = Integer.parseInt(br.readLine());
		
		char[] a = new char[q];
		int[] l = new int[q];
		int[] r = new int[q];
		
		
		StringTokenizer st;
		for(int i = 0; i < q; i++ ) {
			st = new StringTokenizer(br.readLine());
			a[i] = st.nextToken().charAt(0);
			l[i] = Integer.parseInt(st.nextToken());
			r[i] = Integer.parseInt(st.nextToken());
			int[] num = new int[26];

			for(int j = l[i]; j <= r[i]; j++) {
				char alphabet = s.charAt(j);
				int alpha = alphabet;
				num[alpha-97] += 1;
			}
			System.out.println(num[a[i] - 97]);
			//System.out.println(Arrays.toString(num));
			
		}
	}
}
