package java0403.singleton;
//인스턴스 사용
public class Company {
    private static Company instance=new Company();

    private Company(){
    }

    public static Company getInstance(){//Company가 리턴 값
        if(instance==null){
            instance=new Company();
        }
        return instance;
    }
    //계속 같은 것을 가져오게 됨
}
