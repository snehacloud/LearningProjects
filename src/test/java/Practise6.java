import java.util.*;

public class Practise6 {
    public static void main(String[] args) {
        String[] inputdata = {"eat", "tea", "ate", "ten", "net"};
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String s : inputdata) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

        }
        for (List<String> output : map.values()) {
            System.out.println(output);
        }
    }
}
