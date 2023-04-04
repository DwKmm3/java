package java0403;

public class StudentCourse {

    int studentId;//앞에 private를 붙이면 public을 이용해서 접근해서 사용 가능
    String studentName;
    /*
    int koreaScore;//국어 점수
    int mathScore;//수학 점수
    String koreaSubject;//국어 과목
    String mathSubject;//수학 과목

    int engScore;
    String engSubject;//<-이렇게 계속 추가하기 번거롭기 때문에 Subject로


     */
    Subject korean;//값을 할당하기 위해서는 타입이 같아야 하기 때문에 같은 Subject타입 값이 들어간다
    Subject math;
    //이게 있으면 위의 것들이 사실 필요가 없음, 클래스 안의 클래스 명을 리턴 받을 수 있음
    //클래스 안에서 클래스를 객체롸(Subject라는 클래스를 math라는 참조 변수로 선언)

    //String과 Subject는 동일한 형태이다(원래 자바에서 제공하지 않는 대문자로 시작하는 참조자료형)
}
