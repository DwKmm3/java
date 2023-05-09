package java0509;
//여기가 인터페이스
public interface Calc {
    double PI=3.14;
    int ERROR=-9999999;
    int add(int num1,int num2);//앞에 public abstract int 붙여도 되나 메모리 낭비
    int substract(int num1,int num2);
    int times(int num1,int num2);
    int divide(int num1,int num2);
    default void description(){
        System.out.println("정수 계산기를 구현합니다");
        myMethod();
    }
    private void myMethod(){
        System.out.println("private 메소드 입니다");
    }
    private static void myStaticMethod(){
        System.out.println("private static 메소드 입니다");
    }
    static int total(int[] arr){
        int total=0;
        for (int i:arr){
            total+=1;
        }
        myStaticMethod();
        return total;
    }
}
