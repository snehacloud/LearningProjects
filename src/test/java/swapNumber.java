import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //System.in is a standard input stream
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        //int c;
        //System.out.println("a is "+a+" and b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        /*c=a;
        a=b;
        b=c;*/
        System.out.println("After swapping , a is "+a+" and b is "+b);
    }

}
