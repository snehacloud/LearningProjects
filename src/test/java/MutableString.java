import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MutableString {
    public static void main(String arg[]){
        StringBuilder str = new StringBuilder("sneha");
        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println(str.append(1));
        System.out.println(str.charAt(4));
        str.setCharAt(1, 'r');
        System.out.println(str);
        System.out.println(str.insert(4,"2"));
        System.out.println(str.length());

        StringBuffer str1 = new StringBuffer("Hello");
        System.out.println(str1);
        System.out.println(str1.append(" World!"));
        System.out.println(str1.reverse());
    }
}
