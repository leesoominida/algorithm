import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());
        s = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            if(binarySearch(a, Integer.parseInt(s[i]))){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }

    public static boolean binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length -1;
        int mid;

        while( left <= right ){
            mid = (left+right) / 2;

            if( arr[mid] < key){
                left = mid + 1;
            }
            else if( arr[mid] > key){
                right = mid - 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}