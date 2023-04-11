package java0403.staticsample;

public class Calc {
    public static int abs(int a){
        return a>0?a:-a;
    }

    public static int max(int a, int b){
        return a>b?a:b;//큰 값이 리턴
    }

    public static int min(int a, int b){
        return a<b?a:b;
    }
}
