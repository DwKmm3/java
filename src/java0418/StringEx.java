package java0418;

import java.util.Arrays;

public class StringEx {
    public static void main(StringEx[] args) {
        //1. 문자열의 길이
        String str1="Hello Java";
        System.out.println(str1.length());

        //2. 문자열 검색(charAt(), indexOf(), lastIndex())

        //charAt 자리
        System.out.println(str1.charAt(1));//e

        //indexOf, lastIndexOf 문자나 문자열
        System.out.println(str1.indexOf('a'));//a가 몇 번 쨰 위치해 있는가(가까운거 출력)
        System.out.println(str1.lastIndexOf('a'));//얜 뒤에서 부터

        //3. 문자열 변환 및 연결

        //String.valueDf
        String str2=String.valueOf(2.3);

        //concat
        String str3=str2.concat(str1);
        System.out.println(str3);

        //String.valueOf()+concat()
        String str4="안녕+3";
        String str5="안녕".concat(String.valueOf(3));

        // 4. 문자열->byte[] (getBytes()), 문자열->char[] (toCharArray))
        String str6="Hello Java";
        String str7="안녕하세요";

        byte[]array1=str6.getBytes();//쪼개져서 배열에 저장
        byte[]array2=str7.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        char[]array3=str6.toCharArray();
        char[]array4=str7.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}