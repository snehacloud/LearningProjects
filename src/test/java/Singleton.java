public class Singleton {
    private static Singleton single_instance = null;
    public int s;
    private Singleton(int a,int b)
    {
        s = a+b;
    }
    static Singleton getInstance(int a, int b)
    {
        if (single_instance == null) {
            single_instance = new Singleton(a,b);
        }
        return single_instance;
    }

}
