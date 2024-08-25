import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] arg){
        String str = "my name is jack";
        System.out.println("Original String: "+str);

        String[] arr = str.split(" ");
        String[] narr = new String[arr.length];
        StringBuilder rev = new StringBuilder();
        for (int i=0; i<arr.length; i++)
        {
            rev = new StringBuilder(arr[i]);
            narr[i] = String.valueOf(rev.reverse());
        }

        String nstr = String.join(" ", narr);

        System.out.println("Reverse String: "+ nstr);
    }

}
