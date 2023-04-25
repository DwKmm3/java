package java0418;

public class EffOFPrmryArg {
    public static void main(String[] args) {
        int a=3;//지역 변수
        int resul1=twice(3);

        System.out.println(resul1);

        int result2=twice(a);
        System.out.println(result2);
    }
    public static int twice(int a){
        a=a*2;
        return a;
    }
}

