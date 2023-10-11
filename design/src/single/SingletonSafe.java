package single;

//单例模式，懒汉式
public class SingletonSafe {
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

    //这是线程安全的情况
    public static synchronized SingletonSafe getUniqueInstance(){
        if (uniqueInstane == null) {
            uniqueInstane = new SingletonSafe();
        }
        return uniqueInstane;
    }
}
