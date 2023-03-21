package java0314;

public class DataType {
    public static void main(String[] args) {
        int num=15;//10진수
        int num2=015;//0이 들어가면 8진수
        int num3=0x15;//0x가 들어가면 16진수
        int num4=0b0101;//0b가 들어가면 2진수

        long longNum=24l;
        long longNum2=24L;

        double doubleNum=0.1234;//<-카멜 타입
        double doubleNum2=1234E-4;//10의 -4제곱 =0.1234

        float floatNum =0.123f;

        double doubleNum3=.1234d;

        char a='w';
        char b='글';

        boolean isBoolean = true;
        boolean isBooleab = false;

        boolean istrue=10>8;//boolean타입일 때 is를 붙임

        System.out.println(istrue);

        String str=null;


    }
}
