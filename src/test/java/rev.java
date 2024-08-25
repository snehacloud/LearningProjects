public class rev {

        public static void main(String[] args) {
            String input = "india is my country";
            String output = reverseWordsInString(input);
            System.out.println(output);
        }

        public static String reverseWordsInString(String input) {
            String[] words = input.split(" ");
            String reversedString = "";

            for (String word : words) {
                reversedString += reverseWord(word) + " ";
            }

            return reversedString.trim();
        }

        public static String reverseWord(String word) {
            char[] charArray = word.toCharArray();
            int left = 0, right = word.length() - 1;

            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }

            return new String(charArray);
        }


}
