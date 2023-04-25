package java0418;

//필드와 지역변수의 구분

//1. 클래스를 생성
class Fld{
    int m=3;//필드=클래스의 내부 구성 요소 색깔로 구분 가능, 객체를 만들 때 필드만 사용 가능
    int n=4;//필드
    void work1(){
        int k=5;//클래스 중괄호 안에 있는 것이 아니고 메서드 중괄호 안에 있으므로 지역변수
        System.out.println(k);//지역변수 출력
        work2(3);//work1을 호출하면 3은 i로 전달
    }
    void work2(int i){//int i는 입력 매개 변수 (i라는 입력매개변수를 받아서 work2를 실행시킨다) 지역변수이다
        int j=4;//지역변수
        System.out.println(i+j);
    }
}
public class Field {
    public static void main(String[] args) {
        //2. 클래스를 활용하여 객체 생성
        Fld a=new Fld();

        //3. 필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);

        //메서드 호출
        a.work1();//5와 7이 나오는데 5는 지역변수 7은 work2메서드에서 가져온 값
    }
}
