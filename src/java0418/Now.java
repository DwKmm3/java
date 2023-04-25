package java0418;

import java.util.Calendar;

import java.text.SimpleDateFormat;
public class Now {
    public static void main(String args[]){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar c1 = Calendar.getInstance();

        String strToday = sdf.format(c1.getTime());



        System.out.println("Today=" + strToday);

    }
}