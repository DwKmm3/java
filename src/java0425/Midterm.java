package java0425;

import java0321.Array;

import java.util.Arrays;

public class Midterm {
    public static void numCk(int num[]){
        int[] intArray=new int[15];

        for (int i=0;i<num.length;i++){//array는 10개 설정
            for (int j=0;j<10;j++){//i가 한 번 돌 동안, j는 10번 실행
                if(num[i]==j){//i가 j와 같다면 (1초과가 나오게 됨)
                    intArray[j]++;//j를 증가
                }
            }
            //intArray[num[i]]++;//여기에 이걸 두면 이중for문을 사용하지 않아도 됨, 단 배열에 10개를 선언해뒀는데 10개 이상을 검출하려면 인덱스 오류가 발생함

            int result=++intArray[i];
            System.out.println(result);
        }
        boolean bool=true;
        for (int k=0;k<intArray.length;k++){
            if (intArray[k]>1){
                bool=false;
                break;
            }
        }
        System.out.println(Arrays.toString(num)+":"+bool);
    }
    public static void main(String[] args) {
        int []a1={0,1,2,3,4,5,6,7,8,9};
        int []a2={9,1,2,3,4,5,6,7,9,9,9,9};
        int []a3={8,1,2,3,4,5,6,7,8,8};
        int []a4={7,1,2,3,4,7,7,7};
        int []a5={6,1,6,6,6,6};

        numCk(a1);
        numCk(a2);
        numCk(a3);
        numCk(a4);
        numCk(a5);
    }
}
