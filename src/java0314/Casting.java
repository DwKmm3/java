package java0314;

public class Casting {

    public static void implicit(){//암묵적
        byte bNum=10;//1byte
        int iNum=bNum;//4byte
        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2=20;
        float fNum=iNum;
        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum=fNum+iNum;
        System.out.println(dNum);//더블형은 자동 형변환
    }

    public static void explicit(){//명시적
        double dNum=1.2;
        float fNum=0.9f;//0.9를 캐스팅하면 0

        int iNum=(int) (dNum+fNum);//int로 변환
        int iNum2=(int)dNum+(int)fNum;

        System.out.println(iNum);
        System.out.println(iNum2);

    }
    public static void main(String[] args) {
        //암묵적 캐스팅
        implicit();
        System.out.println("=======");

        //명시적 캐스팅
        explicit();
    }
}
