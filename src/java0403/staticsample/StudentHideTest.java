package java0403.staticsample;
//미리 진도 나간 것
public class StudentHideTest {
    public static void main(String[] args) {
        StudentHide studentHide = new StudentHide();

        studentHide.setStudentId(1111111);
        studentHide.setStudentName("홍길동");
        studentHide.setStudentDepart("인공지능");
        studentHide.setStudentAddress("서울시 강남구 서초구");

        studentHide.getStudentAddress();

        System.out.println(studentHide.toString());

        StudentHide studentHide2 = new StudentHide();
        studentHide2.setStudentName("이순신");

        System.out.println(studentHide2.toString());
    }
}
