package cracking.coding.interview.chap1;

/**
 * Created by miking38 on 12/17/14.
 */
public class Q1_1 {


    public boolean isUniqueCharSet(String str) {
        final int CHAR_SIZE = 256;
        boolean[] charSet = new boolean[CHAR_SIZE];
        for (int i=0; i<CHAR_SIZE; i++)
            charSet[i] = false;

        for (int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val])
                return false;
            charSet[val] = true;
        }

        return true;
    }
}
