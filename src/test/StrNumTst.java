package test;

public class StrNumTst {
    public static void main(String[] args) {
        StrNum num1=StrNum.getInstance();
        StrNum num2=StrNum.getInstance();


        //같은 메모리를 공유한다.

        System.out.println(num1==num2);//주소 값 비교
    }
}
