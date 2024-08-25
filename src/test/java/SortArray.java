import java.util.Arrays;

public class SortArray {
    public static void main(String arg[]){
        int[] arr ={1,-1,7,0,4,-4,-2,5,2};
        //Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else{
                    arr[i]=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
