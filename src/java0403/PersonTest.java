package java0403;

public class PersonTest {
    public static void main(String[] args) {//Person을 객체화 시키기 위해 main사용
        Person person=new Person();//디폴트 생성자 1.을 호출
        person.name="김유신";
        person.height=180.0F;
        person.weight=85.5F;

        Person personKim=new Person("김춘추");

        Person personLee=new Person("이순신",180,80.1F);//캐스팅 돼 있어서 값만 입력하면 됨, 짧지만 수정 할 때 또 선언을 해줘야하 한다

        Person personPark=new Person("박지성",175,70);

        System.out.println(personKim);
        System.out.println(personLee);

        System.out.println(person);

        System.out.println(person.name);

        System.out.println(personKim.name);
        System.out.println(personKim.height);

        System.out.println(personLee.weight);

        System.out.println(personPark.name);
    }
}
