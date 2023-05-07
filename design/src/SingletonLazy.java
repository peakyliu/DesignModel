//懒汉式，线程安全
public class SingletonLazy {
    private static SingletonLazy uniqueInstance = new SingletonLazy();

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getSingletonLazy(){
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();

        }
        return uniqueInstance;
    }
}
