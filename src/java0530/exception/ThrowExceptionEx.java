package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExceptionEx {
    public Class loadClass(String fileName,String className)throws
            FileNotFoundException,ClassNotFoundException{
        FileInputStream fls=new FileInputStream(fileName);
        Class c=Class.forName(className);
        return c;
    }
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        ThrowExceptionEx test=new ThrowExceptionEx();
        test.loadClass("a.txt","java.lang.String");
    }
}
