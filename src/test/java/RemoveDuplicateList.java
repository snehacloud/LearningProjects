import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(){{
            add("apple");
            add("banana");
            add("apple");
            add("orange");
            add("banana");
            add("grapes");
        }};
        System.out.println("Original list:"+fruits);
        Set<String> newFruits = new LinkedHashSet<>();
        newFruits.addAll(fruits);
        System.out.println(newFruits);
    }
}
