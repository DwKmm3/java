package java0403;

public class StudentInfo {
    int studentId;
    private String studentName;//StudentIfo에서 이걸 쓰려면 private가 되어 있어 직접 쓸 수는 없고,

    public int getStudentId(){
        return this.studentId;
    }//set
    public void setStudentId(int studentId){
        if(studentId<=10000){
            this.studentId=10000;
        }else{
            this.studentId=studentId;
        }
        this.studentId=studentId;
    }//set
    public String getStudentName(){
        return studentName;//여기도 this.studentName이 맞긴함, this->메모리에 올라와 있는 클래스의 객체를 가리킴, 멤버 형태로 멤버를 접근할 때 사용
    }
    public void setStudentName(String studentName){//여기서 public으로 setStudentName을 만들어주어 사용 가능
        this.studentName=studentName;
    }
}
