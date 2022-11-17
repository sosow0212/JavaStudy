package com.sosow0212;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class st {
    public static void main(String[] args) {
        List<Integer> test = List.of(1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 2);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(test.get(0));
        int count = 1;

        for (int i = 1; i < test.size() - 1; i++) {
            int before = queue.peek();
            int now = test.get(i);

            if(before == now && count < 4) {
                count ++;
                queue.add(now);
            }

            if(before == now && count >= 4 && now == test.get(i+1)) {
                count ++;
                queue.add(now);
            }

            if(now != before && count >= 4) {
                for(int j=0; j<count; j++) {

                }
            }
        }
    }
}
