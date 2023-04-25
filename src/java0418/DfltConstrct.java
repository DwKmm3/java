package java0418;

//컴파일러가 자동 추가해주는 생성자(기본 생성자)
class A{
    int m;//필드
    void work(){//메서드
        System.out.println(m);
    }
}//생성자가 아예 없다(컴파일러가 자동으로 추가)

class B{
    int m;
    void work(){
        System.out.println(m);
    }
    B(){//기본 생성자(입력매개변수가 없음)

    }
}

class C{
    int m;//a값으로 초기화
    void work(){
        System.out.println(m);//생성자로 넘어온 값
    }
    C(int a){//객체 생성, 필드 초기화
        m=a;//매개 변수로 넘어온 a를 m에 넣는다
    }//입력 매개변수로 int 값을 받는 생성자(기본 생성자 없음)
}
public class DfltConstrct {
    public static void main(String[] args) {
        //1. 클래스의 객체 생성
        A a=new A();
        B b=new B();
        C c=new C(3);//C()는 매개변수가 없는 기본 생성자 그래서 매개변수를 직접 입력해줘야 한다

        //2. 메서드 호출
        a.work();//0
        b.work();//0
        c.work();//3

        //메서드를 호출하려면 객체 생성은 필수
    }
}
