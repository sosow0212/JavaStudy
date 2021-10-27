package com.sosow0212.알고리즘;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 입력
 * 4 5 1 3
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 *
 * 출력
 * 1 2 3 4
 */

/**
 * BFS (Breath First Search) 너비우선탐색
 *
 * 시작 정점으로부터 가까운 정점을 방문하고
 * 점점 멀리 있는 정점을 순차적으로 탐색하는 알고리즘이다.
 *
 * 특징으로는 DFS와 다르게 재귀적으로 동작하지 않고,
 * 큐(Queue)를 이용하고, 가까운 정점의 순서로 탐색한다.
 */

public class bfs {
    static final int MAX = 10;
    static int N, E; // 정점의 개수, 간선의 개수
    static int V; // 탐색을 시작할 정점의 번호
    static int[][] Graph = new int[MAX][MAX];
    static boolean Visited[] = new boolean[MAX];


    public static void bfs(int V) {

        Queue<Integer> q = new LinkedList<>();

        int n = Graph.length;

        q.add(V);
        Visited[V] = true;

        while(!q.isEmpty()) {
            V = q.poll();
            System.out.print(V + " ");

            for(int i=0; i<n; i++) {
                if(Graph[V][i] == 1 && Visited[i] == false) {
                    q.add(i);
                    Visited[i] = true;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 정점의 개수
        E = sc.nextInt(); // 간선의 개수
        V = sc.nextInt(); // 탐색을 시작할 정점의 번호

        for(int i=0; i<E; i++) {
            int u = sc.nextInt(); // 연결되는 간선 입력.
            int v = sc.nextInt(); // 연결되는 간선 입력.
            Graph[u][v] = Graph[v][u] = 1;
        }

        bfs(V);
    }

}

