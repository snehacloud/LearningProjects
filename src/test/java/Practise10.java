import java.util.LinkedHashMap;
import java.util.Map;

public class Practise10 {
    public static void main(String arg[]){
        String str1 = "obcdexyzabcd";
        str1 = str1.toLowerCase();
        String[] arr = str1.split("xyz");
        if(arr[0].length() - arr[1].length() == 0 || arr[0].length() - arr[1].length() == 1 ||arr[1].length() - arr[0].length() ==1){
            System.out.println("True");
        }
        else System.out.println("False");

    }
}
