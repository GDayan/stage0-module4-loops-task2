package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        while (num <= printToInclusive) {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 2; i <= num; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(factorial);
            num++;
        }
    }
}

