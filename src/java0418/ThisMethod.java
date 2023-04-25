package java0418;

//1. 생성자 안에서만 호출 가능
//2. 생성자 첫 줄에서만 사용 가능
class Th{
    Th(){
        System.out.println("first");
    }
    Th(int th){
        this();//=Th();
        System.out.println("second");
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        Th th=new Th();
        Th th2=new Th(2);
    }
}
