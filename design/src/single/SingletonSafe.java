package single;

//单例模式，懒汉式
public class SingletonSafe {
    //volatile保证了可见性，而且防止了，JVM指令重排
    private volatile static SingletonSafe uniqueInstane;

    private SingletonSafe() {
    }

    //这是线程不安全的情况
//    public static SingletonSafe getUniqueInstance(){
//        if (uniqueInstane == null) {
//            uniqueInstane = new SingletonSafe();
//        }
//        return uniqueInstane;
//    }

    //这是线程安全的情况，但是这里在方法上面加锁代价比较大，我们只需要第一次没有创建时候创建用到即可，之后直接返回创建的对象
    public static synchronized SingletonSafe getUniqueInstance(){
        if (uniqueInstane == null) {
            uniqueInstane = new SingletonSafe();
        }
        return uniqueInstane;
    }
}
