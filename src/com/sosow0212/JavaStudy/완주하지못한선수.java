package com.sosow0212.JavaStudy;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        System.out.println(map);

        // 1 2 3 4
        // 1 2 3
        for(String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        완주하지못한선수 sol = new 완주하지못한선수();

        String[] participant = {"leo", "kiki", "mina"};
        String[] completion = {"leo", "kiki"};
        System.out.println(sol.solution(participant, completion));
    }
}

