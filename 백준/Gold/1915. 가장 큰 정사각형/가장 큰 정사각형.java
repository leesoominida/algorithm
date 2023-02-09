import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine(), " ");
        String str;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Number [][] = new int [N+1][M+1];
        int D [][] = new int [N+1][M+1];

        // 입력
        for(int i = 1 ; i <= N ; i++) {
            str = br.readLine();
            for(int j = 1 ; j <= M ; j++) {
                Number[i][j] = str.charAt(j - 1) - 48;
            }
        }

        // 점화식을 이용한 계산
        int Answer = 0;
        for(int i = 1 ; i <= N ; i++) {
            for(int j = 1 ; j <= M ; j++) {
                if(Number[i][j] == 1) {
                    D[i][j] = Math.min(Math.min(D[i][j-1], D[i-1][j]),D[i-1][j-1]) + 1;
                    Answer = Math.max(Answer, D[i][j]);
                }
            }
        }

        // 정답찾기
        bw.write(Answer * Answer + "\n");
        bw.flush();
        bw.close();
    }
}
