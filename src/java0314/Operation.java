package java0314;

public class Operation {
    public static void operation(){//산술연산자
        int mathScore=90;
        int engScore=70;
        int totalScore=mathScore+engScore;
        System.out.println("총점"+totalScore);
        double avgScore=totalScore/2;
        System.out.println("평균"+avgScore);
    }

    public static void operation2(){
        int gameScore=150;
        int lastScore1=++gameScore;
        //int lastScore2=--gameScore;

        //int lastScore1=gameScore++;
        int lastScore2=gameScore--;

        //값은 차이가 없으나 대입(할당)할 때 차이가 발생

        System.out.println(lastScore1);
        System.out.println(lastScore2);
    }
    public static void main(String[] args) {
        operation();
        operation2();

        //
        int num=10;
        int i=2;

        boolean value = ((num=num+10)<10)&&((i=i+2)<10);//and(앞에서 먼저 false이기 때문에 뒷 연산은 제치고 앞의 결과만 출력
        System.out.println(value);

        boolean value2=((num=num+10)<10)||((i=i+2)<10);//or
        System.out.println(value2);
    }
}
