package someSample;

import java.math.BigDecimal;

public class CompareDemo {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("1.0");
        BigDecimal bigDecimal = BigDecimal.valueOf(1);
        BigDecimal decimal1 = BigDecimal.valueOf(1.0);
        System.out.println(decimal.equals(bigDecimal)); // false这里是因为equals不仅比较数值的大小，而且会比较精度
        System.out.println(bigDecimal.compareTo(decimal)); //这里使用compareTo 比较好，因为compareTo仅仅比较数值大小，忽略精度如果大于返回1，如果小于返回-1，相等就返回0
    }
}
