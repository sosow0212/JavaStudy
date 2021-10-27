package com.sosow0212.알고리즘;

// DFS
import java.util.*;

public class dfs {
    static final int MAX_N = 10; //
    static int N,E;
    static int[][]Graph = new int[MAX_N][MAX_N];
    static boolean[] Visited = new boolean[MAX_N];

    static void dfs(int node) {
        Visited[node] = true;
        System.out.print(node + " ");

        for(int next=0; next<N; ++next) {
            if(!Visited[next] && Graph[node][next] != 0)
                dfs(next);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 노드 정점
        E = sc.nextInt(); // 간선 엣지
        for(int i=0; i<E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1; // 그래프는 대각선 대칭이므로
        }
        dfs(0);
        // 입력 5,6 > 정점과 간선.
        // 입력 0 1 0 2 1 3 1 4 2 4 3 4 >> 2개씩 끊어서 연결된 정점끼리 2개씩 묶어서 씀.
        // 출력 : 0 1 3 4 2 >> 방문한 정점

    }
}