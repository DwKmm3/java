package java0411.inher;

public class CustomerVip extends Customer{
    private  int agenId;
    double saleRatio;
    public CustomerVip(){
        customerGrade="VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }
    public CustomerVip(int customerId,String customerName,int agentId){
        super(customerId,customerName);
        customerGrade="VIP";
        bonusRatio=0.05;
        saleRatio=0.1;
    }

    @Override
    public int calPrice(int price) {
        //return super.calPrice(price);
        bonusPoint+=price+bonusRatio;
        return price-(int)(price*saleRatio);
    }

   /* public int calcPrice(int price){
        bonusPoint+=
    }*/
    public int getAgenId(){
        return agenId;
    }
}
