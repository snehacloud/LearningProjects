public class test {

       public int sum(int a, int b){
           int s=a+b;
           return s;
       }

       public static void main(String arg[]){
           test a = new test();
           System.out.println(a.sum(5,9));
       }
}
