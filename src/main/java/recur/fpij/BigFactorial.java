package recur.fpij;

import java.math.BigInteger;

import static recur.fpij.TailCalls.call;
import static recur.fpij.TailCalls.done;

/**
 * Created by mare
 */
public class BigFactorial {
    public static BigInteger decrement(final BigInteger number){
        return number.subtract(BigInteger.ONE);
    }

    public static BigInteger multiply(final BigInteger first,final BigInteger second){
        return first.multiply(second);
    }

    public static TailCall<BigInteger> factorialTailRec(final BigInteger factorial,final BigInteger number){
        if(number.equals(BigInteger.ONE)){
            return done(factorial);
        }else{
            return call(() -> factorialTailRec(multiply(factorial,number),decrement(number)));
        }
    }

    public static BigInteger factorial(final BigInteger number){
        return factorialTailRec(BigInteger.ONE,number).invoke();
    }

    public static void ex1(){
        System.out.println(factorial(BigInteger.valueOf(20000)));
    }
}
