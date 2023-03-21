package java0314;

public class IfExample {
    public static void onlyif(int age){//if
        int charge;

        if(age<8){
            charge=1000;
            System.out.println("취학 전 아동");
        }
        if (age<14) {
            charge=2000;
            System.out.println("초등학생입니다");
        }
        if (age<20) {
            charge=3000;
            System.out.println("청소년입니다");
        }else {
            charge=4000;
            System.out.println("성인입니다");
        }

        System.out.println("입장료는"+charge+"입니다");
    }
    public static void main(String[] args) {//if else
        int age=9;
        int charge;

        if(age<8){
            charge=1000;
            System.out.println("취학 전 아동");
        } else if (age<=9&&age<14) {//<-이렇게 해야 정확
            charge=2000;
            System.out.println("초등학생입니다");
        } else if (age<20) {
            charge=3000;
            System.out.println("청소년입니다");
        }else {
            charge=4000;
            System.out.println("성인입니다");
        }

        System.out.println("입장료는"+charge+"입니다");

        onlyif(age);
    }
}
