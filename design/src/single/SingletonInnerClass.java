package single;

/**静态内部类实现
 * 只有在调用getUniqueInstance时候，内部类才会被加载，此时INSTANCE才被实例化一次
 * JVM确保了线程安全
 */
public class SingletonInnerClass {
    private SingletonInnerClass() {
    }

    private static class SingletonHolder{
        public static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}
