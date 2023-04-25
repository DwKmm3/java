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
/*
(1) 학생 클래스 구현하기
학생 클래스는 "이름", "가진 돈"을 멤버 변수로 가진다.
그리고 "버스를 탄다", "지하철을 탄다", "택시를 탄다", "학생의 현재 정보를 보여준다"를 메서드로 가진다.

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
package cooperation;

public class Student {
    public String studentName; // 학생 이름
    public int money;          // 가진 돈

    // 매개변수로 학생이름, 가진 돈을 받는 생성자
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 버스를 탄다
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000; // 버스요금 1000원을 지불
    }

    // 지하철을 탄다
    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;  // 지하철 요금 1500원을 지불
    }

    // 택시를 탄다
    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;  // 택시 요금 10000원 지불
    }

    // 학생의 현재 정보를 출력하는 메서드
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은"+money+"입니다.");
    }
}

Colored by Color Scripter
cs

(2) 버스 클래스 구현하기
버스 클래스는 "버스번호", "승객수", "버스 수입"을 멤버 변수로 가진다.
그리고 "승객이 버스에 탄 경우", "버스의 현재 정보를 보여준다"를 메서드로 가진다.
학생 한명이 버스에 탄다면 버스 요금을 1000원 받고 승객 수가 한 명 증가한다.

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
package cooperation;

public class Bus {
    int busNumber;          // 버스 번호
    int passengerCount;     // 승객 수
    int money;              // 버스 수입

    // 매개변수로 버스 번호를 받는 생성자
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 승객이 버스에 탈 때
    public void take(int money) {
        this.money += money;      // 버스 요금 (매개변수 money)만큼 버스 수입이 증가
        passengerCount++;         // 승객 수 증가
    }

    // 버스의 현재 정보 출력
    public void showInfo() {
        System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은"+ money+"입니다.");
    }
}

Colored by Color Scripter
cs

(3) 지하철 클래스 구현하기
버스 클래스는 "지하철 노선", "승객수", "지하철 수입"을 멤버 변수로 가진다.
그리고 "승객이 지하철에 탄 경우", "지하철의 현재 정보를 보여준다"를 메서드로 가진다.
학생 한명이 버스에 탄다면 지하철 요금을 1500원 받고 승객 수가 한 명 증가한다.

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
package cooperation;

public class Subway {
    String lineNumber;      // 지하철 노선
    int passengerCount;     // 승객 수
    int money;              // 지하철 수입

    // 매개변수로 지하철 노선을 받는 생성자
    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    // 승객이 지하철에 탄다면
    public void take(int money) {
        this.money = money;      // 지하철 요금 (매개변수 money)만큼 지하철 수입이 증가
        passengerCount++;        // 승객 수 증가
    }

    // 지하철 현재 정보 출력
    public void showInfo() {
        System.out.println(lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
    }

}
Colored by Color Scripter
cs

(4) 택시 클래스 구현하기
택시 클래스는 "택시 번호", "승객수", "택시 수입"을 멤버 변수로 가진다.
그리고 "승객이 택시에 탄 경우", "택시의 현재 정보를 보여준다"를 메서드로 가진다.
학생 한명이 버스에 탄다면 택시 요금을 10000원 받고 승객 수가 한 명 증가한다.

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
package cooperation;

public class Taxi {
    int taxiNumber;           // 택시 번호
    int passengerCount;       // 택시 승객 수
    int money;                // 택시 수입

    // 매개변수로 택시 변수를 받는 생성자
    public Taxi(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    // 택시에 승객이 타면
    public void take(int money) {
        this.money += money;      // 택시 요금(매개변수 money)만큼 택시 수입 증가
        passengerCount++;         // 승객 수 증가
    }

    // 택시 현재 정보 출력
    public void showInfo() {
        System.out.println(taxiNumber+"의 승객은"+passengerCount+"명이고, 수입은 "+money+"원이다.");
    }
}
Colored by Color Scripter
cs


(5) 학생, 버스, 지하철, 택시 객체 협력하기
세 학생 James, Tomas, Edward가 있습니다. 이 세 학생은 각각 버스, 지하철, 택시를 타고 학교에 갑니다.
세 학생이 교통 수단을 이용한 후 각자가 가진 돈의 변화와 버스, 지하철, 택시의 수입을 알아보자.

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        // 학생 세 명 생성
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas",10000);
        Student studentEdward = new Student("Edward",20000);

        Bus bus100 = new Bus(100);    // 노선 번호가 100인 버스 생성
        studentJames.takeBus(bus100); // James가 100번 버스를 탐
        studentJames.showInfo();      // James의 정보 출력
        bus100.showInfo();            // bus의 정보 출력

        Subway subwayGreen = new Subway("2호선");  // 노선 번호가 2호선인 지하철 생성
        studentTomas.takeSubway(subwayGreen);     // Tomas가 2호선을 탐
        studentTomas.showInfo();                  // Tomas의 정보 출력
        subwayGreen.showInfo();                   // subway의 정보 출력

        Taxi taxi4534 = new Taxi(4534);           // 택시 번호가 4534인 택시 생성
        studentEdward.takeTaxi(taxi4534);         // Edward가 4534번 택시를 탐
        studentEdward.showInfo();                 // Edward의 정보 출력
        taxi4534.showInfo();                      // taxi의 정보 출력
    }
}


* */
