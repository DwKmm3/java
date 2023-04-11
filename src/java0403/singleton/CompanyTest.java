package java0403.singleton;
//java ss
public class CompanyTest {
    public static void main(String[] args) {
        Company company1=Company.getInstance();
        Company company2=Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        //같은 메모리를 공유한다.

        System.out.println(company1==company2);//주소 값 비교
    }
}
