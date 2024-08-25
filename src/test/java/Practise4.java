import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practise4 {
    public static void main(String arg[]){
        char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'};
//        for(int i=0; i<alph.length; i++){
//            if((i+1)%2 == 0){
//                String c = String.valueOf(alph[i]);
//                System.out.print(c.toUpperCase());
//            }
//            else System.out.print(alph[i]);
//       }
        Map<String,String> map = new LinkedHashMap<>();
        for(int i=0; i<alph.length; i++){
            if((i+1)%2 == 0){
                map.put(String.valueOf(alph[i]),"True");
            }
            else map.put(String.valueOf(alph[i]),"False");
        }
        System.out.println(map);
        String name = "sneha";
        char[] nam = name.toCharArray();
        for(int i=0; i< nam.length; i++){
            System.out.println(nam[i]+"="+map.get(String.valueOf(nam[i])));
        }
    }
}
