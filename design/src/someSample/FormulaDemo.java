package someSample;

public class FormulaDemo {
    public static void main(String[] args) {

        //通过匿名内部类方式访问接口,调用的接口不能是被声明为abstract或者实现的方法
        Formula formula = new Formula() {
            //这里可以重写calculate方法，由于
            @Override
            public double calculate(int a) {
                return Math.sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
    }
}
