package com.sosow0212.날짜;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class 날짜구하기 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);


        // 날짜 더하기 String 형식으로 날짜 출력
        // yyyy-mm-dd hh:mm 으로 포맷 지정
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date date = new Date(); // 현재 날짜

        Calendar cal = Calendar.getInstance(); // 날짜 계산을 위해 Calendar 추상클래스 선언 및 getInstance() 메서드 사용
        cal.setTime(date);

        cal.add(Calendar.DATE, 30);
        String dateString = format.format(cal.getTime());
        System.out.println(dateString);
    }
}
