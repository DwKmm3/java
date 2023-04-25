package java0425;

//import java0411.inher.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee=new Customer();
        customerLee.setCustomerId(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint=1000;

        System.out.println(customerLee.showCustomerInfo());

        Customer customerKim=new CustomerVip(10020,"김유신",12345);
        customerKim.bonusPoint=1000;
        System.out.println(customerKim.showCustomerInfo());
        System.out.println("======= 할인율과 보너스 포인트 계산 =======");

        int price=10000;
        int LeePrice=customerLee.calPrice(price);
        int KimPrice=customerKim.calPrice(price);

        System.out.println(customerLee.getCustomerName()+"님이 "+LeePrice+"원 지불하셨습니다");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.getCustomerName()+"님이 "+KimPrice+"원 지불하셨습니다");
        System.out.println(customerKim.showCustomerInfo());
    }
}
