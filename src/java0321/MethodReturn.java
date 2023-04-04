package java0321;

public class MethodReturn {
    public static int[] makeArray(){//이걸 잘 맞춰줘야 함
        int temp[]=new int[20];
        for(int i =0;i<temp.length;i++){
            temp[i]=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        int intArray[]=makeArray();//이것과
        int sum=0;
        for(int i=0;i<intArray.length;i++){//=(int i : intArray)
            sum+=i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
