import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.reflect.Array.set;

public class Practise7 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        Set<Character> set = new LinkedHashSet<>();
        int i=0;
        while(i<str1.length()) {
            set.add(str1.charAt(i));
            i++;
        }
        System.out.println(set);
        Iterator<Character> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
