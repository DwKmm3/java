package java0321;

public class MyDataTest {
    public static void main(String[] args) {
        MyData myDate = new MyData();
        //MyDate.day=31;
        myDate.setDay(31);
        int day=myDate.getDay();
        System.out.println(day);
    }
}
