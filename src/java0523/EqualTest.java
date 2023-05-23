package java0523;

class Student{
    int studentId;
    String studentName;
    public Student(int studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public String toString(){
        return studentId+", "+studentName;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std=(Student) obj;
            if(studentId==std.studentId){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public int hashCode(){
        return studentId;
    }

}
public class EqualTest {
    public static void main(String[] args) {
        Student studentLee=new Student(100,"이상원");
        Student studentLee2=studentLee;
        Student studentSang=new Student(100,"이상원");

        if (studentLee==studentLee2){
            System.out.println("studentLee와 studentLEE2는 같습니다");
        }else {
            System.out.println("studentLee와 studentLEE2의 주소는 다릅니다");
        }
        if (studentLee.equals(studentLee2)){
            System.out.println("studentLee와 studentLEE2는 같습니다");
        }else {
            System.out.println("studentLee와 studentLEE2는 다릅니다");
        }

        //주소는 다르지만 equal의 결과가 true인 경우
        if (studentLee==studentSang){
            System.out.println("studentLee와 studentSang은 같습니다");
        }else {
            System.out.println("studentLee와 studentSang은 다릅니다");
        }
        System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
        System.out.println("studentSang의 hashCode : "+studentSang.hashCode());

        System.out.println("studentLee의 실제 주소 값 : "+System.identityHashCode(studentLee));
        System.out.println("studentSnag의 실제 주소 값 : "+System.identityHashCode(studentSang));

        if(studentLee.studentName==studentSang.studentName){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        if ("1".equals("1")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        if (studentLee.studentName.equals(studentSang.studentName)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
