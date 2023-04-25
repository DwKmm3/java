package java0418;

class F{
    int m;
    int n;

    void init(int m, int n){
        this.m=m;
        this.n=n;
    }
}
public class ThisKeyword_2 {
    public static void main(String[] args) {
        F f=new F();
        f.init(2,3);

        System.out.println(f.m);
        System.out.println(f.n);
    }
}

