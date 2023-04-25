package java0418;

import java.util.Arrays;

public class FlxSizArrArg {
    public static void main(String[] args) {
        me1(1,2);
        me1(1,2,3);
        me1();

        me2("안녕");
        me2("방가");
        me2("감사");
    }

    public static void me1(int...values){//가변 길이 배열(몇 자리던 수용 가능)
        System.out.println("배열의 길이"+values.length);

        for (int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        /*for (int k:values){
            System.out.println(values[k]);
        }*/
        System.out.println(Arrays.toString(values));
    }
    /*public static void me1(int a){

    }
    public static void me2(int a, int b){

    }
    public static void me1(int a, int b, int c){
        System.out.println();
    }*/

    public static void me2(String...values){
        for (String k:values){
            System.out.println(k);
        }
        System.out.println(values.length);
    }
}
