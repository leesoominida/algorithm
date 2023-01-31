import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int AB[];
    static int CD[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
            C[i] = Integer.parseInt(st.nextToken());
            D[i] = Integer.parseInt(st.nextToken());
        }

        AB = new int[N*N];
        CD = new int[N*N];
        int idx = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                AB[idx] = A[i] + B[j];
                CD[idx++] = C[i] + D[j];

            }
        }

        Arrays.sort(AB);
        Arrays.sort(CD);

        long ans = 0;
        int left = 0;
        int right = N*N - 1;
        while(left < N*N && right >= 0){
            if(AB[left] + CD[right] < 0){
                left++;
            } else if(AB[left] + CD[right] > 0) {
                right--;
            } else {
                long leftcnt = 1;
                long rightcnt = 1;
                while (left + 1 < N * N && (AB[left] == AB[left + 1])) {

                    leftcnt++;
                    left++;
                }
                while(right > 0 && (CD[right] == CD[right -1])){
                    rightcnt++;
                    right--;
                }
                ans += leftcnt*rightcnt;
                left++;
            }
        }
        System.out.println(ans);


    }
}
