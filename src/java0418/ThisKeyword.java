package java0418;

//클래스 내부에서 필드, 메서드 앞에 자동으로 붙는 this 키워드
class T{
    int m;//필드(T클래스의 멤버1)
    int n;//필드(멤버2)
    void init(int a, int b){//메서드(멤버3)
        this.m=a;//필드에 값 대입=필드를 사용한다
        this.n=b;
    }
    void work(){//메서드
        this.init(2,3);//직접 넣어서 호출(멤버4)=메서드를 사용한다
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        T t=new T();

        t.work();
        System.out.println(t.m);
        System.out.println(t.n);
    }
}
