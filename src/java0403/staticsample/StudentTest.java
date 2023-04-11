package java0403.staticsample;
public class StudentTest {
    public static void main(String[] args) {
        Student studentLee=new Student();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNum);

        Student studentHong=new Student();
        studentHong.setStudentName("홍길동");
        System.out.println(studentHong.serialNum);

        Student studentKim=new Student();
        studentKim.setStudentName("김춘추");
        System.out.println(studentKim.serialNum);

        studentLee.serialNum++;//이것만 있으면 아래 sout이 전부 1001
        //studentHong.serialNum++;//이것도 있으면 아래 sout이 전부 1002
        //studentKim.serialNum++;
        //왜 필요한 것?->없으면 여기선 당연히 다 1000인데 StudentNumberTset에서는 없어도 잘 돌아감

        //Student student=new Student();
        //studentHong.setStudentName("홍길동");

        //객체가 다름에도 같은 주소를 공유
        System.out.println(studentHong.serialNum);
        System.out.println(studentLee.serialNum);
        System.out.println(studentKim.serialNum);
    }
}
