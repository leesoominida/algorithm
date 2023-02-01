import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int child[][] = new int[27][3];

    static void preorder(int node){
        if(node == 0){
            return;
        }
        System.out.print((char)('A' + node - 1));
        preorder(child[node][0]);
        preorder(child[node][1]);
    }

    static void inorder(int node){
        if(node == 0){
            return;
        }
        inorder(child[node][0]);
        System.out.print((char)('A'+node-1));
        inorder(child[node][1]);
    }

    static void postorder(int node){
        if(node == 0){
            return;
        }
        postorder(child[node][0]);
        postorder(child[node][1]);
        System.out.print((char)('A' + node -1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char a  = st.nextToken().charAt(0);
            char b = st.nextToken().charAt(0) ;
            char c = st.nextToken().charAt(0);

            if(b!='.'){
                child[a-'A' + 1][0] = b - 'A' + 1;
            }
            if(c!='.'){
                child[a-'A'+1][1] = c - 'A' +1;
            }

        }
        preorder(1);
        System.out.println();
        inorder(1);
        System.out.println();
        postorder(1);

    }
}
