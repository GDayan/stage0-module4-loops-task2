package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            System.out.println(factorial(number));
            number++;
        }
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

