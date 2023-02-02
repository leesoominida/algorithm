import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        boolean[] primes = new boolean[K+1];
        primes[1] = true;

        for (int i = 2; i < K ; i++) {
            if(primes[i]){
                continue;
            }
            BigInteger n = new BigInteger(Integer.toString(i));
            if(P.mod(n).compareTo(BigInteger.ZERO) == 0){
                System.out.println("BAD " + n);
                return;
            }
            for (int j = i+i; j <= K ; j+=i) {
                primes[j] =true;
            }
        }
        System.out.println("GOOD");
    }

}
