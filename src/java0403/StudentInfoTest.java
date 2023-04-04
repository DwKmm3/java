package java0403;

public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo studentInfo=new StudentInfo();

        //studentInfo.studentId="홍길동";//int타입이라 불가
        //studentInfo.StudentName();//private로 되어있어 접근 불가

        studentInfo.setStudentName("홍길동");//StudentInfo참조

        System.out.println(studentInfo.getStudentName());

    }
}
