import recur.fpij.RodCutterBasic;

import java.util.HashMap;

/**
 * Created by mare
 */
public class Main2 {

    public static void main(String... arg) {
        RodCutterBasic cutter = new RodCutterBasic();
//        System.out.println(cutter.maxProfit(5));
//        System.out.println(cutter.maxProfit(22));

//        System.out.println(cutter.maxProfitMemo(5));
        System.out.println(cutter.maxProfitMemo(22));
        System.out.println(cutter.maxProfitMemo2(22, new HashMap<>()));
    }
}
