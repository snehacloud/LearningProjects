import java.util.Arrays;
import java.util.Scanner;

public class Practise13 {
    public static void main(String[] args) {
        //find the largest kth element in  an array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        try {
            int[] arr = {4,6,2,7,9};
            int i=0;
            while(i<arr.length-1){
                for(int j=i; j<arr.length; j++ ){
                    if(arr[i]<arr[j]){
                        int temp;
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
                i++;
            }
            System.out.println(k+"th largest element: "+ arr[k-1]);
        }
        catch (Exception e){
            System.out.println("There is no element at "+k+"th position");
        }
    }
}
