import java.util.Scanner;

public class reverseString {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        String nstr="";
        for(int i=0; i<str.length(); i++)
        {
          nstr = str.charAt(i)+nstr;
        }
        /*StringBuilder nstr = new StringBuilder();
        nstr.append(str);
        nstr.reverse();*/

        System.out.println("Reverse String is: "+nstr);

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = num.nextInt();
        int r, rev = 0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("reversed number: "+ rev);
    }
}
