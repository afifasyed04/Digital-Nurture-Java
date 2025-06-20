package FinanceForecast;
import java.util.HashMap;
import java.util.Map;

public class FutureValueCalculator {

    private static Map<Integer, Double> memo = new HashMap<>();

    // Memoized Recursive Method
    public static double futureValueMemo(double pv, double rate, int periods) {
        if (periods == 0) {
            return pv;
        }
        if (memo.containsKey(periods)) {  // Check if already computed
            return memo.get(periods);
        }
        double result = futureValueMemo(pv, rate, periods - 1) * (1 + rate);
        memo.put(periods, result);  // Store result
        return result;
    }

    public static void main(String[] args) {
        double pv = 1000;
        double rate = 0.05;
        int periods = 3;

        double fvMemo = futureValueMemo(pv, rate, periods);
        System.out.printf("Memoized Future Value: %.2f%n", fvMemo);  // Output: 1157.63
    }
}