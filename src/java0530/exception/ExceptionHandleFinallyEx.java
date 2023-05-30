package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandleFinallyEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fls=null;

        try {
            fls=new FileInputStream("a.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e);
            return;
        }
        finally {
            if(fls != null){
                try {
                    fls.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("항상 수행됩니다");
    }
}
