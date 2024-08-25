import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countInString {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = sc.nextLine();
        char[] al = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c: al){
            if (map.containsKey(c))
            {
                map.put(c, map.get(c) +1);
            }
            else
            {
                map.put(c, 1);
            }
            }
        System.out.println(map);
        for (Map.Entry<Character,Integer> cis : map.entrySet())
        {
            System.out.println(cis.getKey() + " : "+cis.getValue());
        }
    }
}
