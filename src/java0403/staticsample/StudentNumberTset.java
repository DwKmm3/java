package java0403.staticsample;

public class StudentNumberTset {
    public static void main(String[] args) {
        StudentNumber studentLee=new StudentNumber();
        studentLee.setStudentName("이순신");

        System.out.println(studentLee.serialNum);
        System.out.println(studentLee.getStudentName()+" 학번 : "+studentLee.studentId);
        //변숭[ 데헤서는 필요한 경우 get(), set() 메서드를 제공-private(접근제어자 사용)-클래스의 외부에서 클래스 내부의 멤버 변수나 메서드에 접곤하지 못하게 하는 경우 사용

        StudentNumber studentHong=new StudentNumber();
        studentHong.setStudentName("홍길동");
        System.out.println(studentHong.serialNum);
        System.out.println(studentHong.getStudentName()+" 학번 : "+studentHong.studentId);

        StudentNumber studentKim=new StudentNumber();
        studentKim.setStudentName("김춘추");
        System.out.println(studentKim.serialNum);
        System.out.println(studentKim.getStudentName()+" 학번 : "+studentKim.studentId);


    }
}
