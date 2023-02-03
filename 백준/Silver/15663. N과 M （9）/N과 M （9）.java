import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        permutation(0, new int[M], new boolean[N]);

        System.out.println(sb);
    }

    static void permutation(int cnt, int[] selected, boolean[] visited){
        if(cnt == M){
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < cnt; i++) {
                tmp.append(selected[i]).append(" ");
            }
            String str = tmp.toString();
            if(!set.contains(str)){
                set.add(str);
                sb.append(tmp).append('\n');
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                selected[cnt] = arr[i];
                visited[i] = true;
                permutation(cnt+1, selected,visited);
                visited[i] = false;
            }

        }
    }



}
