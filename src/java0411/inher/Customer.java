package java0411.inher;

public class Customer {
    private int customerId;
    private String customerName;
    protected String customerGrade;
    private int bonusPoint;
    double bonusRatio;
    public Customer(){
        customerGrade="Silver";
        bonusRatio=0.01;
    }
    public int calPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }
}
