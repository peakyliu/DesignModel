public class SingletonSafe {
    private static SingletonSafe uniqueInstane = new SingletonSafe();

    private SingletonSafe() {
    }

    public static SingletonSafe getSingletonSafe(){
        if (uniqueInstane == null) {
            uniqueInstane = new SingletonSafe();
        }
        return uniqueInstane;
    }
}
