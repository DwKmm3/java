package java0411.inher;

public class CustomerVip extends Customer{
    private  int agenId;
    double saleRatio;
    public CustomerVip(){
        customerGrade="VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }
    public int getAgenId(){
        return agenId;
    }
}
