import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int L;
    public static int C;
    public static char[] input;
    public static char[] pwd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        input = new char[C];
        pwd = new char[L];

        for (int i = 0; i < C; i++) {
            input[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(input);
        combi(0,0);


    }

    public static void combi(int cnt, int start){
        if(cnt==L){
            if(check(pwd)){
                for(char c: pwd){
                    System.out.print(c);
                }
                System.out.println();
            };
            return;
        }
        for(int i = start; i < C; i++){
            pwd[cnt] = input[i];
            combi(cnt+1, i+1);
        }
    }
    

    public static boolean check(char[] c){
        int consonant = 0;
        int vowel = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' ){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        if(consonant>=2 && vowel >=1) {
            return true;
        }
        else{
            return false;
        }
    }
}