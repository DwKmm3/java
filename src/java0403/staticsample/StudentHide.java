package java0403.staticsample;

public class StudentHide {
    //get set 만들기
    private int studentId;
    private String studentName;
    private String studentDepart;
    private String studentAddress;
    private String studentTelNo;
    //변수 4개 생성
    //private라서 접근이 힘들다 그래서 get, set이 필요


    //alt+insert
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepart() {
        return studentDepart;
    }

    public void setStudentDepart(String studentDepart) {
        this.studentDepart = studentDepart;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentTelNo() {
        return studentTelNo;
    }

    public void setStudentTelNo(String studentTelNo) {
        this.studentTelNo = studentTelNo;
    }

    /*
    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer();
        sb.append("studentId=").append(this.studentId).append('\'');
        sb.append("studentName").append(this.studentName).append('\'');//하나하나씩 추가해서 배열 형태로 sb에 저장
        sb.append("studentAddress").append(this.studentAddress).append('\'');
        sb.append("studentDepart").append(this.studentDepart).append('\'');

        return sb.toString();
    }
    */
    //이거 alt+insert toString()으로 바꾸기

    @Override
    public String toString() {
        return "StudentHide{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDepart='" + studentDepart + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentTelNo='" + studentTelNo + '\'' +
                '}';
    }
    //자바에서 객체는 다 상속 구조, 클래스를 만들면 암묵적으로 자동으로 상속 형성
}
