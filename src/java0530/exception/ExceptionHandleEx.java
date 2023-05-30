package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandleEx {
    public static void main(String[] args) {
        try {
            FileInputStream fls=new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("여기서도 수행됩니다");
    }
}
