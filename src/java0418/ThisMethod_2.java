package java0418;

class Tm{
    int m1,m2,m3,m4;
    Tm(){
        m1=1;
        m2=2;
        m3=3;
        m4=4;
    }

    Tm(int a){
        this();
        m4=a;
    }

    Tm(int a, int b){
        this(2);
        m2=a;
        m3=b;

        //동일함
        //this(a);
        //m2=b;
    }

    void print(){
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
public class ThisMethod_2 {
    public static void main(String[] args) {
        Tm tm=new Tm();
        tm.print();

        Tm tm2=new Tm(10);//넣을 값
        tm2.print();

        Tm tm3=new Tm(10,20);//넣을 값
        tm3.print();
    }
}
