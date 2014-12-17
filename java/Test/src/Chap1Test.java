
import cracking.coding.interview.chap1.Q1_1;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by miking38 on 12/17/14.
 */
public class Chap1Test {
    @Test
    public void q1_1test() {
        Q1_1 q1_1 = new Q1_1();
        Assert.assertTrue(q1_1.isUniqueCharSet("abcdef"));
        Assert.assertFalse(q1_1.isUniqueCharSet("abcda"));
    }
}
