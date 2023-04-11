package java0403.staticsample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDate() {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return localDate;
    }//LocalDataTime=new가 필요없는 변수

    public static String getCurrentDate(String pattern) {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
        return localDate;
    }

    public static String getCurrentMonth() {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        return localDate;
    }
}
