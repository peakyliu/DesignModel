package someSample;

public class FormulaDemo {
    public static void main(String[] args) {

        //通过匿名内部类方式访问接口
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return Math.sqrt(a * 100);
            }
        };


        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
    }
}
