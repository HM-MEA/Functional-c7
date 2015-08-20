package recur.fpij;

/**
 * Created by mare
 */
public class ExampleCode {

    //末尾再帰の例
    public int func1(int i) {
        //メソッドの戻り値が自分自身の呼び出しもしくは定数・変数
        if (i < 0) {
            return 0;
        } else {
            return func1(i - 1);
        }
    }
}
