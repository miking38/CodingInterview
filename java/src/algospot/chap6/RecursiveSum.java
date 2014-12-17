package algospot.chap6;

/**
 * Created by miking38 on 12/11/14.
 */
public class RecursiveSum {

    int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n-1);
    }
}
