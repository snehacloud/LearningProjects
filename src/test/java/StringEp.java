import java.sql.Array;
import java.util.Arrays;

public class StringEp {
    public static void main (String arg[]){
        String str = "sneha is name my";
        String[] arr = str.split(" ");
        String[] narr = new String[arr.length];
        for(int i=arr.length-1; i>=0; i--){
                narr[arr.length-1-i] = arr[i];
        }
            StringBuilder nstr = new StringBuilder();
            for(String word : narr){
                nstr.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        System.out.println(nstr);
    }
}
