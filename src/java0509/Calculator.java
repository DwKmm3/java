package java0509;
//여기가 인터페이스를 이용한 추상 클래스
public abstract class Calculator implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }
//오버라이딩하고 이걸 구현하려면
    /*@Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1/num2;
    }*/
}
