public class SortingArray {
    public static void main(String arg[]){
        int[] arr = new int[]{1,11,2,22,3,4,21};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                int temp;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =temp;
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
