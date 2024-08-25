import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str =sc.nextLine();
        str=str.toLowerCase();
        String nstr="";
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr=ch+str;
        }
        if(str==nstr){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }

        int num=12321;
        int a=num,r,rev=0;
        while (a>0){
            r=a%10;
            rev= rev*10 + r;
            a=a/10;
        }
        if (num==rev){
            System.out.println("Number is Palindrome");
        }
        else System.out.println("Number is not Palindrome");
    }
}
