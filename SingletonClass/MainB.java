package SingletonClass;

public class MainB {
    private static B b = null;

    private B(){
        
    }

    public static B getInsatnce() {

        if (b == null)
            b = new B();
        return b;
    }
}
