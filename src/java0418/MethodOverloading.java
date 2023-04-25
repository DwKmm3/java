package java0418;

public class MethodOverloading {//입력매개변수가 다른 동일한 이름의 메서드를 여러개 정의하는 것=입력매개변수의 타입이 다른 것
    public static void main(String[] args) {
        print();
        print(2);
        print(2.2);
    }
    public static void print(){//입력매개변수 없음
        System.out.println("데이터 없음");
    }
    public static int print(int a){//메서드 이름이 같은데 입력매개변수가 달라 같이 존재가 가능, 입력매개변수 int
        System.out.println(a);
        return a;
    }
/*    public static void print(int a){
        System.out.println(a);
    }*/
    //위 아래 코드 뭐가 다른거지

    public static void print(double a){
        System.out.println(a);
    }
    /*public static void print(double b){//자료형의 변수 명이 달라도 시그니처(입력매개변수가 같아서 오류가 발생)
        System.out.println(a);
    }*/
    public static void print(int a, int b){
        System.out.println(a+", "+b);
    }
}
