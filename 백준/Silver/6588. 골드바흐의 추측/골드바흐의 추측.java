import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i <= isPrime.length-1 ; i++) {
            isPrime[i] = true;
        }
        for(int i =2; i <= isPrime.length -1; i++){
            for(int j = i*2; j<=isPrime.length -1; j += i){
                    if(!isPrime[j]){
                        continue;
                    }
                    isPrime[j] = false;
            }
        }
        while(true){
            int n = Integer.parseInt(br.readLine());
            boolean num = false;
            if(n == 0){
                break;
            }
            for(int i = 2; i <= n/2; i++){
                if(isPrime[i] && isPrime[n-i]){
                    System.out.println(n + " = " + i + " + " + (n-i));
                    num = true;
                    break;
                }
            }
            if(!num){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

    }
}
