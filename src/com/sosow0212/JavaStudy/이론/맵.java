package com.sosow0212.JavaStudy.이론;

/**
 * 맵은 Key와 Value로 이뤄져 있다.
 * Ex) Key: people, Value: 사람
 * key 값으로 value를 꺼낸다.
 * 값을 지우거나 할 때에도 key값만 건든다.
 */

import java.util.HashMap;

/**
 * Map 역시 List와 마찬가지로 인터페이스이다.
 * Map 인터페이스를 구현한 Map자료형에는
 * HashMap, LinkedHashMap, TreeMap등이 있다.
 */

public class 맵 {
    public static void main(String[] args) {
        // hashmap 역시 제네릭스 사용 -> 키와 밸류 모두 String 값이다.
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");


        System.out.println("map.get(people) == " + map.get("people")); // 사람
        System.out.println("map.get(사람) == " + map.get("사람")); // null

        System.out.println(map.containsKey("people")); // true

        System.out.println(map); // {baseball=야구, people=사람}

        System.out.println(map.remove("people"));

        System.out.println(map.size()); // 1개 -> people을 지웠으므로

    }
}
