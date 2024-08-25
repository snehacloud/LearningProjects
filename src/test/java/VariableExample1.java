import org.testng.annotations.Test;

public class VariableExample1 {
        static int x = 11;
        private int y = 33;
        public void method1(int x)
        {
            VariableExample1 t = new VariableExample1();
            this.x = 22;
            y = 44;


            System.out.println("VariableExample1.x: " + VariableExample1.x);
            System.out.println("t.x: " + t.x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }

        public static void main(String args[])
        {
                VariableExample1 t = new VariableExample1();
            t.method1(5);
        }
}
