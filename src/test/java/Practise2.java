import java.util.*;

public class Practise2 {
    //[eat,tea,ate,ten.net]
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate through each word
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String sortedWord = sortString(word);

            // Check if the sortedWord key is already in the map
            if (anagramMap.containsKey(sortedWord)) {
                // If it exists, add the current word to the existing list
                List<String> anagramList = anagramMap.get(sortedWord);
                anagramList.add(word);
            } else {
                // If it doesn't exist, create a new list and add it to the map
                List<String> newList = new ArrayList<>();
                newList.add(word);
                anagramMap.put(sortedWord, newList);
            }
        }

        // Collect all groups of anagrams
        List<List<String>> result = new ArrayList<>();
        for (Iterator<List<String>> it = anagramMap.values().iterator(); it.hasNext(); ) {
            result.add(it.next());
        }

        return result;
    }

    // Helper method to sort the characters of a string
    private static String sortString(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("eat", "tea", "ate", "ten", "net");
        List<List<String>> groupedAnagrams = groupAnagrams(input);

        // Print the result
        for (int i = 0; i < groupedAnagrams.size(); i++) {
            System.out.println(groupedAnagrams.get(i));
        }
    }
}



