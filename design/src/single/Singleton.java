package single;

//双重校验锁，因为只需要被实例化一次就可以使用了，所以先判断uniqueInstance是不是已经被实例化了，如果没有被实例化，就需要对实例化的过程进行加锁
//第二次加锁是因为在if判断和new创建的过程中，为了防止重复创建对象
//volatile保证了可见性，禁止指令重排，保证即使是在多线程的情况下也能安全运行
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
