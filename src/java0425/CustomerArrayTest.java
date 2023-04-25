package java0425;

import java.util.ArrayList;

public class CustomerArrayTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList=new ArrayList<>();

        Customer customerLee=new Customer(10010,"이순신");
        Customer customerShin=new Customer(10010,"신사임당");
        Customer customerHong=new Customer(10010,"홍길동");
        Customer customerYul=new Customer(10010,"이율곡");
        Customer customerKim=new CustomerVip(10050,"김유신",12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("======= 고객 정보 출력 =======");
        for (Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        /*int aa[]=new int[10];
        for (integer i : int[10]){

        }*/
        //이거랑 같음
    }
}
