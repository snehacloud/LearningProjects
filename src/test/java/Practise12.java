import java.util.LinkedHashMap;
import java.util.Map;

public class Practise12 {
// str= swiss O/p=w
public static void main(String[] args) {
    String str ="ississippi";
    char[] ch = str.toCharArray();
    Map<Character,Integer> map = new LinkedHashMap<>();
    for(char c: ch){
        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }
        else{
            map.put(c,1);
        }
    }
    System.out.println(map);
    char[] arr = new char[map.size()];
    int i=0;
    for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue() == 1 ) {
                arr[i] = entry.getKey();
                i++;
        }
    }
    System.out.println(arr[0]);
}
}
