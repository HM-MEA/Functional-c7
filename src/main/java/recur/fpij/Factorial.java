package recur.fpij;

import static recur.fpij.TailCalls.call;
import static recur.fpij.TailCalls.done;

/**
 * Created by mare
 */
public class Factorial {

    public static int factorialRec(final int number){
        if(number == 1){
            return number;
        }else{
            return number * factorialRec(number - 1);
        }
    }

    public static TailCall<Integer> factorialTailRec(final int factorial,final int number){
        if(number == 1){
            return done(factorial);
        }else{
            return call(() -> factorialTailRec(factorial * number,number - 1));
        }
    }

    public static int factorial(final int number){
        return factorialTailRec(1,number).invoke();
    }

    public static void ex1(){
        System.out.println(factorialRec(5));
    }

    public static void ex2(){
        try{
            System.out.println(factorialRec(20000));
        }catch (StackOverflowError e){
            e.printStackTrace();
        }
    }

    public static void ex3(){
        System.out.println(factorialTailRec(1,5).invoke());
    }

    public static void ex4(){
        System.out.println(factorialTailRec(1,20000).invoke());
    }

    public static void ex5(){
        System.out.println(factorial(5));
        System.out.println(factorial(20000));
    }
}
