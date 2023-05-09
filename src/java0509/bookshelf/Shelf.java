package java0509.bookshelf;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;
    public Shelf(){
        shelf=new ArrayList<>();//<>안에 String 써도되고 안써도됨 왜냐-> 위에서 String을 썼기 때문에 아래에도 같은 것이라는 암묵적 규칙
    }
    public ArrayList<String>getShelf(){
        return shelf;
    }
    public int getCount(){
        return shelf.size();
    }
}
