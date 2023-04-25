package java0418;

import java.util.Arrays;

public class EffRefDtArg {
    public static void main(String[] args) {
        int[] ar1=new int[]{1,2,3};

        modi(ar1);
        print(ar1);//4,5,6
    }
    public static void modi(int[] a){
        a[0]=4;
        a[1]=5;
        a[2]=6;
    }
    public static void print(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
