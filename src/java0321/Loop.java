<<<<<<< HEAD
package java0321;

public class Loop {

    //do while 문
    public static void dowhileEx(){
        int num=1;
        int sum=0;

        do{
            sum+=num;
            num++;
        } while (num<=10);//최소한 한 번은 do에서 실행하고 조건에 맞으면 반복
        System.out.println("1부터 10까지의 합은"+sum);//do를 먼저 실행하고 while을 실행
    }


    //for문
    public static void forEx(){
        int sum=0;
        for (int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.println("1부터 10까지의 합은"+sum);
    }

    //for문을 이용한 구구단
    public static void Gugu(){
        for(int dan=2;dan<10;dan++){
            for(int times=1;times<=9;times++){
                System.out.println(dan+"x"+times+"="+dan*times);
            }
            //System.out.println();//<-why?
        }
    }

    public static void main(String[] args) {
        int num=1;
        int sum=0;

        while (num<=10){
            sum+=num;
            num++;
        }
        System.out.println("1부터 10까지의 합은"+sum);

        dowhileEx();//<-위에서 선언 해주기
        forEx();
        Gugu();
    }
}
=======
package java0321;

public class Loop {

    //do while 문
    public static void dowhileEx(){
        int num=1;
        int sum=0;

        do{
            sum+=num;
            num++;
        } while (num<=10);//최소한 한 번은 do에서 실행하고 조건에 맞으면 반복
        System.out.println("1부터 10까지의 합은"+sum);//do를 먼저 실행하고 while을 실행
    }


    //for문
    public static void forEx(){
        int sum=0;
        for (int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.println("1부터 10까지의 합은"+sum);
    }

    //for문을 이용한 구구단
    public static void Gugu(){
        for(int dan=2;dan<10;dan++){
            for(int times=1;times<=9;times++){
                System.out.println(dan+"x"+times+"="+dan*times);
            }
            //System.out.println();//<-why?
        }
    }

    public static void main(String[] args) {
        int num=1;
        int sum=0;

        while (num<=10){
            sum+=num;
            num++;
        }
        System.out.println("1부터 10까지의 합은"+sum);

        dowhileEx();//<-위에서 선언 해주기
        forEx();
        Gugu();
    }
}
>>>>>>> github/master
