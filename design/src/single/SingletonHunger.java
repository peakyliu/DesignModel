package single;

//饿汉式，线程安全,因为加锁之后可以防止多次实例化，但是也丢失了之前节约资源带来的好处
public class SingletonHunger {
    private static SingletonHunger uniqueInstance = new SingletonHunger();

    private SingletonHunger() {
    }

    public static synchronized SingletonHunger getUniqueInstance(){

        return uniqueInstance;
    }
}
