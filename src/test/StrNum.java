package test;

public class StrNum {
    private static StrNum instance=new StrNum();

    private StrNum(){
    }

    public static StrNum getInstance(){
        if(instance==null){
            instance=new StrNum();
        }
        return instance;
    }
}
