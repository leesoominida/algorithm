import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] alphabet = new Integer[26];
        Arrays.fill(alphabet, 0);

        for (int i = 0; i < N; i++) {
            char input[] = br.readLine().toCharArray();
            int pos = 1;

            for(int j = input.length -1; j >=0; j--){
                alphabet[input[j] - 'A'] += Integer.valueOf(pos);
                pos *= 10;
            }
        }
        
        Arrays.sort(alphabet, Collections.reverseOrder());
        int value = 9;
        int answer = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == 0){
                break;
            }
            answer += alphabet[i] * value--;
        }
        System.out.println(answer);
        br.close();
    }
}
