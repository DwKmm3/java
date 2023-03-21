package java0314;

public class First {
    public static int sum(int n,int m){
        int s=n+m;

        return s;
    }
    //바로 사용하기 위해 static
    public static void main(String[] args) {
        int i=20;
        int s;//초기화x
        char a;

        s=sum(i,20);

        System.out.println("합은"+s+"입니다");

        //a="가";//<-char라서 오류가 뜸
        a='가';
        System.out.println(a);

        String str ="안녕하세요";
        System.out.println(str);
    }
}
