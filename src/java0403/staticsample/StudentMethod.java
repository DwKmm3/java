package java0403.staticsample;
//미리 진도 나간 것
public class StudentMethod {
    private static int serialNum=1000;
    public int studentId;
    private String studentName;
    private int grade;
    private String address;

    public StudentMethod() {
        serialNum++;
        studentId=serialNum;
    }

    //get set
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum(){
        int i=10;
        return serialNum;
    }

    //set
    public static void setSerialNum(int serialNum) {
        StudentMethod.serialNum = serialNum;
    }
    //StudentMethod는 static메모리에 통으로 올라가기 때문에 new로 힙에 넣지 않고도 클래스 이름만 가지고 사용 가능
}
