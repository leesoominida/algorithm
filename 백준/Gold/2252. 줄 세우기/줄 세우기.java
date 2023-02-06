import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    //인접 리스트로 풀기
    //학생들을 정점으로, 학생들 간의 관계를 간선으로
    //위상 정렬

    static int N, M;
    static ArrayList<Integer>[] Map; // 인접 리스트 배열
    static int[] InDegree; //진입 차수 저장 배열

    public static void main(String[] args) throws IOException {

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Map = new ArrayList[N+1];
        InDegree = new int[N+1];

        //그래프 초기화
        for (int i = 1; i <= N ; i++) {
            Map[i] = new ArrayList<>();
        }

        //진입 차수가 0이 되어 탐색 순서가 도달한 정점을 담는 큐 (진입 차수가 0일때 queue에 집어넣음)
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        //그래프 정의
        // 먼저 출력되어야 하는 학생 > 나중에 출력되어야 하는 학생 순서로 그래프를 구성함
        // 나중에 출력되어야 하는 학생들의 경우엔 진입차수를 1 증가시킴
        int from, to;
        for (int i = 1; i <=M ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            Map[from].add(to); //인접 리스트에 담아줌
            InDegree[to]++; //to의 진입 차수의 값을 증가시켜준다.

        }

        //즉각 선행자가 하나도 없는 것을 찾는다
        //최초 탐색 할 학생을 찾늗다.
        //indegree == 0 출력 가능
        for (int i = 1; i <= N ; i++) {
            if(InDegree[i] == 0){
                dq.addLast(i);
            }
        }

        int seq = 0; // 마지막 공백을 출력하지 않기 위한 변수
        //Queue가 빌 때 까지 계속 수행한다.
        while(dq.isEmpty() == false){
            int now = dq.pollLast(); //현재 탐색 위치
            seq++;
            if(seq == N){
                bw.write(String.valueOf(now));
            }
            else {
                bw.write(String.valueOf(now) + " ");
            }
            for (int next : Map[now]) {
                if(InDegree[next] > 0){
                    InDegree[next]--;
                    if(InDegree[next]==0){
                        dq.addLast(next);
                    }
                }

            }
        }
        bw.flush();
        bw.close();
    }
}

