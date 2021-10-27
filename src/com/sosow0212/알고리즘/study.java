package com.sosow0212.알고리즘;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class study {

    static final int MAX = 10;
    static int N, E, V;
    static int[][] Graph = new int[MAX][MAX];
    static boolean[] visited = new boolean[MAX];

    public static void bfs(int V) {
        Queue<Integer> q = new LinkedList<>();

        int n = Graph.length;

        q.add(V);
        visited[V] = true;

        while(!q.isEmpty()) {
            V = q.poll();
            System.out.println(V + " ");

            for(int i=0; i<n; i++) {
                if(Graph[V][i] == 0 && visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 노드의 개수
        E = sc.nextInt(); // 간선의 개수
        V = sc.nextInt(); // 시작할 정점의 번호

        for(int i=0; i<E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }

        bfs(V);
    }
}
