package java0314;

public class Const {
    public static void main(String[] args) {
        final int MAX_STUDENT_NUM=30;//<-스네이크 타입
        final int MAX_NUM = 100;//이 두개에는 함수 풀에 들어간다
        final int MIN_NUM;

        int count = 30;

        MIN_NUM = 0;//<-상수는 항상 선언해야 한다
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
        System.out.println(count);

        if (count == MAX_STUDENT_NUM){
            System.out.println("TRUE");
        }

        //String str=30;//<-문자열로 입력했기 때문에 오류 발생
        String str="30";
        String str2="30";
        if(str==str2){
            System.out.println("TRUE");
        }
/*
        if((int)str==MAX_STUDENT_NUM){
            System.out.println("TRUE");
        }
        String은 int 형변환이 불가능하다
        */
    }
}
