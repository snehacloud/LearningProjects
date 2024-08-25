import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionsProgram {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(){{add(2);add(2);add(3);add(3);add(4);add(4);}};
        List<Integer> list2 = new ArrayList<>(){{add(5);add(5);add(2);add(2);add(3);add(4);add(9);}};
        List<Integer> list = list1;
        list.addAll(list2);
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int l: list){
            if(map.containsKey(l)){
                map.put(l,map.get(l)+1);
            }
            else
                map.put(l,1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
