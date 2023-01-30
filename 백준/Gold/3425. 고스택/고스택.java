import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static int MAX = 1000000000;

    public static ArrayList<String> list = new ArrayList<>();
    public static int head = 0;
    public static long[] stack = new long[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true){
            list.clear();

            String line = br.readLine();

            if(line.equals("QUIT")){
                break;
            }

            while(!line.equals("END")){
                String[] commandLine = line.split(" ");

                if(commandLine.length == 1){
                    list.add(commandLine[0]);
                } else {
                    list.add(commandLine[0]);
                    list.add(commandLine[1]);
                }

                line = br.readLine();
            }

            int cnt = Integer.parseInt(br.readLine());
            for (int i = 0; i < cnt; i++) {
                int n = Integer.parseInt(br.readLine());
                if(command(n)){
                    sb.append(stack[0]).append("\n");
                } else {
                    sb.append("ERROR\n");
                }

            }
            sb.append("\n");
            br.readLine();
        }
        System.out.println(sb);

    }

    public static boolean command(int n){
        int listSize = list.size();

        head = 0;
        stack[head++] = n;

        for (int i = 0; i < listSize; i++) {
            if(list.get(i).equals("NUM")){
                stack[head++] = Long.parseLong(list.get(i+1));
                i++;
            } else if( list.get(i).equals("POP")){
                if(head<1){
                    return false;
                }
                head--;
            } else if(list.get(i).equals("INV")){
                if(head<1){
                    return false;
                }
                stack[head -1] *= -1;
            } else if(list.get(i).equals("DUP")){
                if(head<1){
                    return false;
                }
                stack[head] = stack[head-1];
                head++;
            } else if(list.get(i).equals("SWP")){
                if(head<2){
                    return false;
                }

                long tmp = stack[head-1];
                stack[head-1] = stack[head-2];
                stack[head-2] = tmp;

            } else if(list.get(i).equals("ADD")){
                if(head<2){
                    return false;
                }
                if(Math.abs(stack[head-1] + stack[head -2]) > MAX){
                    return false;
                }
                stack[head - 2] = stack[head - 1] + stack[head - 2];
                head--;
            } else if(list.get(i).equals("SUB")){
                if(head<2){
                    return false;
                }
                if(Math.abs(stack[head-2] - stack[head -1]) > MAX){
                    return false;
                }
                stack[head-2] = stack[head-2] - stack[head -1];
                head--;

            } else if(list.get(i).equals("MUL")){
                if(head<2){
                    return false;
                }
                if(Math.abs(stack[head-1] * stack[head -2]) > MAX){
                    return false;
                }
                stack[head-2] = stack[head-2] * stack[head -1];
                head--;
            } else if(list.get(i).equals("DIV")){
                if(head<2){
                    return false;
                }
                if(stack[head-1] == 0){
                    return false;
                }
                stack[head-2] = stack[head-2]/ stack[head-1];
                head--;
            } else if(list.get(i).equals("MOD")){
                if(head<2){
                    return false;
                }
                if(stack[head-1] ==0){
                    return false;
                }
                stack[head-2] = stack[head-2] % stack[head-1];
                head--;
            }

        }
        if(head==1){
            return true;
        }
        return false;
    }
}