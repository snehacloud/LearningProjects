import com.beust.ah.A;

import java.util.*;

public class Practise1 {
    //factorial of number
    public int Fact(int n){
        int fact=1;
        int i=1;
        while(i<=n){
            fact = i*fact;
            i++;
        }
        return fact;
    }
    //add two array and sorted ir
//    public int[] sortArr(){
//
//    }

    public static void main(String arg[]){
        Practise1 prac = new Practise1();
       // System.out.println(prac.Fact(6));
        //System.out.println(prac.sortArr());
        int[] arr1 =new int[]{75,49,3,5,7,2};
        int[] arr2 = new int[]{6,8,10,35,17};
        int[] arr = new int[arr1.length+ arr2.length];
        for(int i=0; i< arr1.length; i++){
            arr[i] = arr1[i];
        }
        for(int i=0; i< arr2.length; i++){
            arr[arr1.length+i] =arr2[i];
        }
        //Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]>arr[j]){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
