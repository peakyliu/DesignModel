//懒汉式，线程安全,因为加锁之后可以防止多次实例化，但是也丢失了之前节约资源带来的好处
public class SingletonLazy {
    private static SingletonLazy uniqueInstance = new SingletonLazy();

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getUniqueInstance(){

        return uniqueInstance;
    }
}
