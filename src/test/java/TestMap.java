import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String arg[]){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"sneha");
        map.put(2,"mini");
        map.put(5,"erika");
        System.out.println(map);
        for(Map.Entry<Integer,String> mp : map.entrySet()){
            System.out.println(mp.getKey() + " : " + mp.getValue());
        }

    }
}
