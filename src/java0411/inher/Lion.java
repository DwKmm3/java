package java0411.inher;

public class Lion extends Animal{//얘가 Animal보다 더 큼(갖고 있던거+받은 거)
    private int legs;
    public void roar(){
        System.out.println("사자입니다.");
    }

    public void eat(){
        System.out.println("먹습니다");
    }//이게 먼저 수행 혹은 Animal에 eat을 안쓰고 여기서 선언해도 됨
    //만약 여기 있는 eat말고 Animal에 있는 eat을 쓰고 싶다면 super를 쓰면 됨
}
