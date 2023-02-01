import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> mnq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                if(mnq.isEmpty()){
                    System.out.println("0");
                } else{
                    System.out.println(mnq.poll());
                }
            }else{
                mnq.add(a);
            }
            
        }
    }
}
