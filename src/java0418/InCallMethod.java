package java0418;

public class InCallMethod {//메서드가 4개 존재하게 됨
    public static void main(String[] args) {
        //같은 클래스 안에 있는 내부 메서드 호출
        print();

        int a=twice(3);
        System.out.println(a);//6

        double d=sum(a,3);
        System.out.println(d);
    }
    public static void print(){//static이 붙은 메서드에서 다른 메서드를 호출할 때는 마찬가지로 static이 붙어야 한다(동일한 수식어)
        System.out.println("안녕");
    }

    public static int twice(int k){
        return k*2;//int니까 return필수
    }

    public static double sum(int m, double n){
        return m+n;
    }
}

