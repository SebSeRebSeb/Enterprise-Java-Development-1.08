package BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalTask {
    public static void main(String[] args) {
        BigDecimal Task1 = new BigDecimal("4.2545");
        BigDecimal Task2 = BigDecimal.valueOf(1.2345);
        BigDecimal Task3 = BigDecimal.valueOf(-45.67);

        System.out.println(roundByInt(Task1, 3));
        System.out.println(changeAndRoundByInt(Task2, 3));
        System.out.println(changeAndRoundByInt(Task3, 3));
    }

    private static double roundByInt(BigDecimal a, int b) {

        MathContext mc = new MathContext(b);

        return a.round(mc).doubleValue();
    }

    private static double changeAndRoundByInt(BigDecimal a, int b) {

        MathContext mc = new MathContext(b);

        return a.round(mc).doubleValue() * (-1);
    }
}
