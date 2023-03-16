import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i =  0; i < N; i++) {
			String st = br.readLine();
			Stack<Character> s = new Stack();
			for(int j = 0; j < st.length(); j++) {
				char c = st.charAt(j);
				
				if(c == '(') {
					s.push(c);
				}else {
					if(s.size() == 0) {
						s.push(c);
						break;
					}
					else {
						s.pop();
					}
				}
			}
			if(s.isEmpty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			s.clear();
		}

	}

}
