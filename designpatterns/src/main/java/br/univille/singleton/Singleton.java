public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static getInstance(){
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;
    }
}
