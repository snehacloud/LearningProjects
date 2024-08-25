import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordInSentence {
    public static void main(String arg[]){
        String str ="my name is sneha";
        String[] arr = str.split(" ");
        for(int i=0; i< arr.length; i++){
            String nstr="";
            int j=0;
            while(j<arr[i].length()){
                nstr = arr[i].charAt(j) + nstr;
                j++;
            }
            arr[i] =nstr;
        }
        String newstr = String.join(" ",arr);
        System.out.println(newstr);
    }
}
