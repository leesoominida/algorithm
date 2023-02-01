
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> mxq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if(a== 0){
                if(mxq.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(mxq.poll());
                }
            } else{
                mxq.add(a);
            }
        }

    }
}
