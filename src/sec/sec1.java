package sec;

public class sec1 {
    public static void main(String[] args) {
        System.out.println("한글");
        System.out.println(2);
        String a= "a";
        int n=1;
        System.out.println(a+"와"+n);

        int num;
        num=20;
        System.out.println(num);

        int num1,num2;

        double num3=1.23;
        float num4=3.45f;

        num1=1;
        num2=2;

        System.out.println(num1);
        System.out.println(num3);

        final double PI=3.14;

        System.out.println(PI);

        int numa=127;
        int numb=-128;
        byte numc=127;

        numa++;
        numb--;
        numc++;

        System.out.println(numa);
        System.out.println(numb);
        System.out.println(numc);

        System.out.println(num1+num2+numa+num3);

        int numn=7;
        int numm=8;

        numn=numn-7;
        numm-=2;

        System.out.println(numn);
        System.out.println(numm);

        int nu1=7,nu2=7;
        int result1,result2,result3;

        result1 = --nu1 +4;
        result2 = nu2-- +4;
        result3 = --nu1;//??

        System.out.println(result3);
        System.out.println(result1+"변수의 값"+nu1);
        System.out.println(result2+"변수의 값"+nu2);
//http://www.tcpschool.com/java/java_operator_incAndDec
        int x=10;
        int y=x-- +5+ --x;

        System.out.println(y);
        System.out.println(x);//??왜 8 -> 두번 빼줬기 때문
        //첫 번째 감소 연산자(decrement operator)는 피연산자의 뒤쪽에 위치하므로, 덧셈 연산이 먼저 수행됩니다.
        //덧셈 연산이 수행된 후에 감소 연산이 수행됩니다. (x의 값 : 9)
        //두 번째 감소 연산자는 피연산자의 앞쪽에 위치하므로, 덧셈 연산보다 먼저 수행됩니다. (x의 값 : 8)
        //감소 연산이 수행된 후에 덧셈 연산이 수행됩니다.
        //마지막으로 변수 y에 결괏값의 대입 연산이 수행됩니다. (y의 값 : 23)
    }
}
