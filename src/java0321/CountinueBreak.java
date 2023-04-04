package java0321;

public class CountinueBreak {
    public static void main(String[] args) {
        int total=0;
        int sum=0;

        for(int num=1;num<=100;num++){
            if(num % 2==0) {//나머지가 0일 때
                continue;
            }
            total+=num;
        }
        System.out.println("1부터 100까지 홀수의 합은"+total+"입니다");

        int num;
        for(num=0;;num++){
            sum+=num;
            if(sum>=100){//if문이 없으면 무한 반복
                break;//countinue와의 차이점
            }
        }
        System.out.println("num : "+num);//14까지는 더해야 100이 넘어간다
        System.out.println("num : "+sum);
    }
}
