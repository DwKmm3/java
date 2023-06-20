package java0620;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTestName {
    public static void main(String[] args) {
        try(FileInputStream fls=new FileInputStream("./data/input.txt")) {
            int i;
            while ((i=fls.read())!=-1){
                System.out.println((char)i);
            }
            System.out.println("end");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
