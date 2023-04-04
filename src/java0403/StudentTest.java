package java0403;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();//객체화 된 student=참조 변수
        student.studentName="이순신";//Student 클래스에서 선언해뒀기 때문에 사용 가능

        System.out.println(student.getStudentName());

        Student student2=new Student();//객체화 된 student2=참조 변수
        student2.studentName="세종대왕";

        System.out.println(student2.getStudentName());

        System.out.println(student);
        System.out.println(student2);

        if(student==student2){
            System.out.println("a");
        }else{
            System.out.println("b");
        }


        //StudentCouse, Subject 관련해서 위의 것들 추가하기 귀찮으니 여기서 해보기
        //이거 다 이해하는 것이 중요
        StudentCourse studentCourse=new StudentCourse();
        studentCourse.studentName="김길동";//String 타입 (StudentCourse에서 선언)
        //studentCourse.korean.score=100;
        //studentCourse.korean.subjectName="쉬운 국어";//이거 두 개랑

        Subject subject=new Subject();
        subject.score=100;
        subject.subjectName="쉬운 국어";

        System.out.println(subject.subjectName);

        studentCourse.korean=subject;//Subject 타입 (StudentCourse에서 선언)

        System.out.println(studentCourse.korean.subjectName);

        //studentCourse.korean.subjectName="쉬운 국어";//이거 주석 처리 해야 오류가 나지 않음


        //소스의 구성을 파악하여 side effect error(=에러 때문에 수정을 햇으나 오히려 다른 곳들에서 에러가 발생함)를 주의
    }
}
