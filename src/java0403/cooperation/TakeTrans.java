package java0403.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames=new Student("James",5000);
        Student studentThomas=new Student("Thomas",5000);

        Bus bus=new Bus(100);//쓸 수 있게 선언
        studentJames.takeBus(bus);//takeBus->take
        studentJames.showInfo();//showInfo를 ctrl클릭하여 어떤 코드가 있는지 보자
        bus.showInfo();


        Subway subway=new Subway("2호선");//쓸 수 있게 선언
        studentThomas.takeSubway(subway);
        studentThomas.showInfo();
        subway.showInfo();
/*
        Subway2 subway2=new Subway2("3호선");
        studentJames.takeSubway(subway);
        studentJames.showInfo();
        subway2.showInfo2();

 */

        studentJames.takeSubway(subway);
        subway.showInfo();
    }
}
