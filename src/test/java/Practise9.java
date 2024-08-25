import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practise9 {
    public static void main(String arg[]){
        String str = "My name is sneha";
// Number of words in a string
        String[] arr = str.split(" ");
        System.out.println(arr.length);

// Anagram
        String str1 = "listen";
        String str2 = "silent";
        if(str1.length()==str2.length()){
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals( ch1,ch2 )){
                System.out.println("Anagram");
            }
            else System.out.println("Not Anagram");
        }
        else System.out.println("Not Anagram");

// Count of vowels and constant
        String strg = "Hello World 1234";
        strg = strg.toLowerCase();
        char[] charArr = strg.toLowerCase().toCharArray();
        int vow=0, con=0;
        for(char c: charArr) {
            if (c>='a' && c<='z')
            {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    vow = vow + 1;
                } else
                {
                    con = con + 1;
                }
            }
        }
        System.out.println("Vowels: "+vow+" and Constant: "+con);
    }
}
