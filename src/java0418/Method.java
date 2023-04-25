package java0418;

public class Method {
    public static void main(StringEx[] args) {
        int x=3;
        String name="Dick";
        x=x*17;
        System.out.println("x는"+x+"입니다");
        double d=Math.random();

        for(int i=0;i<10;i++){
            System.out.println("i는"+i+"입니다");
        }

        int y=0;
        if(y==10){
            System.out.println("y는 10이군요");
        }
        else {
            System.out.println("NOT 10");
        }
        System.out.println("여기는 무조건 실행");
    }
}
