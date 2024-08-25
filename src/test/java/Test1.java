import java.util.Arrays;

public class Test1 {
    public static void main(String arg[]){
        String str1 = "eat";
        String str2 = "ten";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }
        else System.out.println("Not-Anagram");
    }
}
