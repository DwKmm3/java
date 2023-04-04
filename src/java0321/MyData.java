package java0321;

public class MyData {
    private int day;
    //private int month;//<-이걸로 쓰면 31
    private int month=2;//2로 초기화시키지 않으면 31을 넣던 관계없이 그 값이 나온다
    private int year;
    public void setDay(int day){
        if (month==2){//윤달
            if(day<1||day>28){
                System.out.println("날짜 형식이 맞지 않습니다");
            }
            else {
                this.day=day;
            }
        }
        else{//<-이걸 추가 안하면 0으로 결과값이 나옴
            this.day=day;
        }
    }
    public int getDay(){
        return this.day;
    }
    /*
    //alt+insert
    public int getMonth() {
        return month;
    }

    public int getMonth(int month) {
        return month;
    }

    public int getYear() {
        return year;
    }

     */


}
