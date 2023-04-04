package java0403;

public class test {
    public static void main(String[] args) {
        int [][]a=new int[2][];
        a[0]=new int[3];
        System.out.println(a[0]);
        System.out.println(a[1]);//a[1]은 현재 비어있는 공간이다. 스택 메모리 a[]가 힙 메모리에서 불러올 것이 없어 빈 공간임을 알려야 하는데 참조 자료형 초기값에는 0을 넣을 수 없기 때문에 그 안에 null이 들어가게 되어 null이 출력된다.
        a[0][0]=1;a[0][1]=2;a[0][1]=3;
        System.out.println(a[0][0]);

        int b[][]=new int[2][3];
        b[0]=new int[2];
        System.out.println(b[0]);//참조 변수기 때문에 주소값이 나온다
    }
}
