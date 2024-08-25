public class StringTest {
    public static void main(String arg[]){
        String str = "sneha";
        String str1 = new String("Sneha");
        //str.concat(" verma");
        str1 = str1.concat(" verma");
        str = str.replace("e","i");
        System.out.println(str);
        System.out.println(str1);
        char[] charArr = str.toCharArray();
        for(int i=0; i<charArr.length; i++){
            System.out.println(charArr[i]);
        }
        String strNew = charArr.toString();
        System.out.println(strNew);
    }
}
