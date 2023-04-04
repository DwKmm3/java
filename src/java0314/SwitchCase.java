package java0314;

public class SwitchCase {
    public static void intCase(int reanking){
        char medalColor;
        switch (reanking){
            case 1:medalColor='G';
                break;//break가 없으면 모두 실행되기 때문에 꼭 넣기
            case 2:medalColor='S';
                break;
            case 3:medalColor='B';
                break;
            default:medalColor='A';//default도 잊지 않고 넣기
        }
        System.out.println(reanking+"등 메달의 색깔은"+medalColor+"입니다");
    }
    public static void main(String[] args) {
        int ranking=1;
        String medal="Gold";
        intCase(ranking);

        int month=3;
        int day;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;//여러개 사용 가능
                break;
            case 4: case 6: case 9: case 11: day=30;
                break;
            case 2:day=28;
                break;

        }
        System.out.println(month+"월");
    }
}
