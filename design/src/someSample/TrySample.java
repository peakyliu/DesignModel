package someSample;

//当try和finally都有return的时候，try的返回值会被忽视掉
//这是因为 try 语句中的 return 返回值会先被暂存在一个本地变量中，当执行到 finally 语句中的 return 之后，这个本地变量的值就变为了 finally 语句中的 return 返回值
public class TrySample {
    public static void main(String[] args) {
        System.out.println(f(2));
    }
    public static int f(int val){
        try {
            return val*val;
        }finally {
            if (val == 2) {
                return 0;
            }
        }
    }
}
