package java0418;

import java.util.Arrays;

public class ArrCallMethod {
    public static void main(String[] args) {
        //배열을 매개변수로 가지는 메서드 호출
        int[]a=new int[]{1,2,3};//이거랑
        printArr(a);

        printArr(new int[]{1,2,3});//이거랑 같음
    }
    public static void printArr(int[] a){//얜 객체가 배열까지 int[]
        System.out.println(Arrays.toString(a));
    }
}
