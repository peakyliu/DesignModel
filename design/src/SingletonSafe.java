//单例模式，饿汉式，线程安全
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
