import java.util.Scanner;

public class Practise5 {
    public static void main(String arg[]){
        String name ="madam";
//        StringBuilder str = new StringBuilder(name);
        System.out.println("Enter string: "+name);
//        if(name.equals(String.valueOf(str.reverse()))){
//            System.out.println("String is Palindrome");
//        }
//        else {System.out.println("String is not Palindrome");}

        String rev = "";
        for(int i=0; i<name.length(); i++){
            rev = name.charAt(i) + rev;
        }
        if(name.equals(rev)){
            System.out.println("String is Palindrome");
        }
        else {System.out.println("String is not Palindrome");}
    }
}
