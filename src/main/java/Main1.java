import recur.fpij.RodCutterBasic;

/**
 * Created by mare
 */
public class Main1 {

    public static void main(String... arg) {
//        Factorial.ex1(); //factorialRec(5)
//        Factorial.ex2(); //factorialRec(20000)
//        Factorial.ex3(); //factorialTailRec(1,5)
//        Factorial.ex4(); //factorialTailRec(1,20000)
//        Factorial.ex5(); //factorial(5),factorial(20000)
//        BigFactorial.ex1(); //bigFactorial(20000)

        RodCutterBasic cutter = new RodCutterBasic();
        System.out.println(cutter.maxProfit(5));
        System.out.println(cutter.maxProfit(22));

    }
}
