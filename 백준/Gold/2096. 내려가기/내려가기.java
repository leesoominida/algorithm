import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int arr[][] = new int[N][3];
        int max_arr[][] = new int[N][3];
        int min_arr[][] = new int[N][3];

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());

        }

        max_arr[0][0] = min_arr[0][0] = arr[0][0];
        max_arr[0][1] = min_arr[0][1] = arr[0][1];
        max_arr[0][2] = min_arr[0][2] = arr[0][2];

        for (int i = 1; i < N; i++) {
            max_arr[i][0] = Math.max(max_arr[i-1][0], max_arr[i-1][1]) + arr[i][0];
            max_arr[i][1] = Math.max(Math.max(max_arr[i-1][0], max_arr[i-1][1]), max_arr[i-1][2]) + arr[i][1];
            max_arr[i][2] = Math.max(max_arr[i-1][1], max_arr[i-1][2]) + arr[i][2];
            min_arr[i][0] = Math.min(min_arr[i-1][0], min_arr[i-1][1]) + arr[i][0];
            min_arr[i][1] = Math.min(Math.min(min_arr[i-1][0], min_arr[i-1][1]), min_arr[i-1][2]) + arr[i][1];
            min_arr[i][2] = Math.min(min_arr[i-1][1], min_arr[i-1][2]) + arr[i][2];

        }

        int max = Math.max(max_arr[N-1][0], Math.max(max_arr[N-1][1], max_arr[N-1][2]));
        int min = Math.min(min_arr[N-1][0], Math.min(min_arr[N-1][1], min_arr[N-1][2]));

        System.out.println(max+ " " + min);
    }

}
