public class Practise8 {
    public static void main(String arg[]){
         String str = "My name is sneha";
         char[] chArr = str.toCharArray();
         //StringBuilder rw = new StringBuilder();
        String rw = "";
         for(char ch : chArr){
             if(ch != ' '){
                 rw=rw+ch;
             }
        }
         System.out.println(rw);

        String nam = "  abc  def\t";
        nam = nam.trim();
        System.out.println(nam);
    }
}
