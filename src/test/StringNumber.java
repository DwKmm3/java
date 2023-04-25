package test;


class Call{
        //1. 리턴타입:void(리턴하지 않음)+매개변수:없음
        void print(){
        System.out.println("안념");
        }

        //리턴타입: int 매개변수:없음
        int data(){
        //...
        return 3;//리턴이 void가 아닌 경우 반드시 리턴이 존재해야 한다
        }

        //리턴타입:double 매개변수:2개
        double sum(int a,double b){
        return a+b;//double형
        }

        //리턴타입:void 내부에 리턴 포함(함수를 종료한다는 의미)
        void printMonth(int m){
        if (m<0||m>12){
        System.out.println("잘못된 입력");
        return;//void일 때 그냥 return만 사용 가능, 함수를 종료한다는 의미
        }
        System.out.println(m+"월 입니다");
        }
        }
public class StringNumber {
    public static void main(String[] args) {
        //2, 객체 생성
        Call c=new Call();

        //3. 메서드 호출(멤버활용)
        c.print();

        //c.data(); 오류는 없으나 이렇게하면 값을 볼 수 없어 아래처럼 자료형을 맞춰서 끌어온다
        int k=c.data();
        System.out.println(k);

        double dd=c.sum(2,3);
        System.out.println(dd);

        c.printMonth(3);
        c.printMonth(-1);
    }
}
