package java0620;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        FileInputStream fls=null;

        try {
            fls=new FileInputStream("./data/input.txt");
            System.out.println(fls.read());
            System.out.println(fls.read());
            System.out.println(fls.read());
        }catch (IOException e){
            System.out.println(e);
            System.out.println("=======위 아래 비교=======");
            e.printStackTrace();
        }finally {
            try {
                fls.close();
            }catch (NullPointerException e){
                System.out.println(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("end");
    }
}
