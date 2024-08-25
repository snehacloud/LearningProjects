public class CallSingleton {
    public static void main(String arg[])
    {
        Singleton x = Singleton.getInstance(3,5);
        System.out.println(x.s);
    }
}
