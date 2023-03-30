package com.adouer._06newdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test01 {
    public static void main(String[] args) {
        //创建一个LocalDate对象
        LocalDate date = LocalDate.of(2022, 12, 31); // 2022年12月31日
        //创建一个LocalTime对象
        LocalTime time = LocalTime.of(23, 59, 59); // 23:59:59
        //创建一个LocalDateTime对象
        LocalDateTime dateTime = LocalDateTime.of(2022, 12, 31, 23, 59, 59); // 2022年12月31日23:59:59
        //获取当前日期和时间
        LocalDateTime now = LocalDateTime.now();
        //格式化日期和时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter); // 格式化为字符串
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatter); // 解析字符串为LocalDateTime对象
        //计算两个日期之间的天数
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2); // 364
        //计算两个时间之间的小时数
        LocalTime time1 = LocalTime.of(0, 0, 0);
        LocalTime time2 = LocalTime.of(23, 59, 59);
        long hoursBetween = ChronoUnit.HOURS.between(time1, time2); // 23
        //计算两个日期时间之间的秒数
        LocalDateTime dateTime1 = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, 12, 31, 23, 59, 59);
        long secondsBetween = ChronoUnit.SECONDS.between(dateTime1, dateTime2); // 31,536,000
    }
}
