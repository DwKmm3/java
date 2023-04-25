package java0418;

class Aa{
    Aa(){
        System.out.println("first 생성자");
    }

    Aa(int Bb){
        System.out.println("second 생성자");
    }

    Aa(int Cc, int Dd){
        System.out.println("third 생성자");
    }
}
public class ConstrtOvrld {//메서드 오버로딩-입력매개변수의 타입이 다르면 서로 다른 메서드로 인식=생성자도 마찬가지

    public static void main(String[] args) {
        Aa aa=new Aa();
        Aa aa1=new Aa(3);
        Aa aa2=new Aa(3,5);
    }
}

