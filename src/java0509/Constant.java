package java0509;

public class Constant {
    int num=10;
    final int Num=200;
    public static void main(String[] args) {
        Constant cons=new Constant();
        cons.num=50;
        //cons.Num=200;//final이라서 오류 발생

        System.out.println(cons.num);
        System.out.println(cons.Num);
    }
}
