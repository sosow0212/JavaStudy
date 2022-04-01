package com.sosow0212.JavaStudy.재귀;

import java.util.Scanner;

public class Flood_fill {

    static int N;
    static int[][] Board = new int[100][100];

    static void fill(int r, int c) {
        if (r < 0 || r > N - 1 || c < 0 || c > N - 1) {
            return;
        }
        if (Board[r][c] == 1) {
            return;
        }

        Board[r][c] = 1;

        fill(r - 1, c);
        fill(r + 1, c);
        fill(r, c - 1);
        fill(r, c + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = 5;
        Board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        int sRow = sc.nextInt();
        int sCol = sc.nextInt();

        fill(sRow, sCol);

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
