import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static String s;
	public static int totalCnt;
	public static char[] nums;
	public static boolean[] isSelected;
	public static int n;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			s = st.nextToken();
			n = Integer.parseInt(st.nextToken());
			totalCnt = 0;
			isSelected = new boolean[s.length()];
			nums = new char[s.length()];
			
			perm(0);
			if(n > totalCnt) {
				System.out.print(s + " " + n + " = ");
				System.out.println("No permutation");
			}
			///totalCnt = 0;
		}
		
		
		
	}
	
	private static void perm(int k) {
		
		if(k == s.length()) {
			totalCnt++;
			if(totalCnt == n) {
				System.out.print(s + " " + n + " = ");
				System.out.println(nums);
				return;
			}
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(isSelected[i] == true) {
				continue;
			}
			nums[k] = s.charAt(i);
			isSelected[i] = true;
			perm(k+1);
			isSelected[i] = false;
			
		}	
	}
	
	

}
