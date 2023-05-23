package java0523.collection;

import java.util.ArrayList;

class MyArray<E>{
    private Object[] array=new Object[10];
    int i;
    public void add(E obj){
        array[i++]=obj;
    }
    public E get(int index){
        return (E) array[index];
    }
}
public class MyArrayTest {
    public static void main(String[] args) {
        MyArray<String> myArray1=new MyArray<>();//main의 자료형에 맞춰준다 여기서는 String형으로
        myArray1.add(new String("Test"));
        myArray1.add(new String("Test2"));
        String str= myArray1.get(0);//여기서 1을 넣으면 null이 나온다. 공간이 없기 때문. 바로 윗 줄을 추가하면 두 개의 공간이 생기니 0과 1까지 출력 가능
        System.out.println(str);

        MyArray<Integer>myArray2=new MyArray<>();
        myArray2.add(new Integer(100));
        Integer num=myArray2.get(0);
        System.out.println(num);

        MyArray<ArrayList<String>>myArray3=new MyArray<>();
        ArrayList<String>strList=new ArrayList<>();
        strList.add("ArrayList");
        myArray3.add(strList);
        myArray3.get(0).get(0);
        System.out.println(myArray3);
        System.out.println(myArray3.get(0));
        System.out.println(myArray3.get(0).get(0));






        ArrayList<String>strList2=new ArrayList<>();
        strList2.add("ArrayList3");
        myArray3.add(strList2);

        System.out.println(myArray3.get(0));
        System.out.println(myArray3.get(0).get(0));
        System.out.println(myArray3.get(0).get(1));
    }
}
