import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));
        

    }
    
    public static int factorial(int n){
        int i = 1;
        for (int j = 1; j <=n; j++) {
            i *= j;
        }
        return i;
    }
}
