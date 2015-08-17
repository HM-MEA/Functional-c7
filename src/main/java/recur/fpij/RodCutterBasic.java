package recur.fpij;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static recur.fpij.Memoizer.callMemoized;

/**
 * Created by mare
 */
public class RodCutterBasic {
    final List<Integer> prices = Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);

    public int maxProfit(final int length) {
        int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
        for (int i = 1; i < length; i++) {
            int priceWhenCut = maxProfit(i) + maxProfit(length - i);
            profit = Math.max(profit, priceWhenCut);
        }
        return profit;
    }

    public int maxProfitMemo(final int rodLength) {
        BiFunction<Function<Integer, Integer>, Integer, Integer> compute =
                (func, length) -> {
                    int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
                    for (int i = 1; i < length; i++) {
                        int priceWhenCut = func.apply(i) + func.apply(length - i);
                        profit = Math.max(profit, priceWhenCut);
                    }
                    return profit;
                };
        return callMemoized(compute, rodLength);
    }
}
