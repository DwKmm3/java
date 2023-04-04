package java0403;

public class Student {

    int studentId;
    String studentName;//그래서 여기에 값 넣어도 똑같음
    String grade;
    //class에서 선언 되었기 때문에 모든 변수들은 힙 메모리에 저장
    public String getStudentName(){//public이 있어야 어디서든 사용
        return studentName;//함수라서 위에 있었기 때문에 사용 가능 홍길동이라는 이름은 먼저 할당되었기 때문에 쓸 수 있는 것
    }
    public void setStudentName(String name){
        studentName=name;//앞에 this.을 붙인다->이 클래스에 대한 변수라는 것을 알리기 위함
    }
    public static void main(String[] args) {
        Student student=new Student();//디폴트 생성자가 만들어진다
        student.studentName="홍길동";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
        //두 가지 비교해보기
    }
}
