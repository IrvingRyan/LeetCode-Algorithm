package test.arrays;

import arrays.TwoSum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * TwoSum Tester.
 *
 * @author IrvingRyan
 * @version 1.0
 * @since <pre>3月 27, 2020</pre> Í
 */
public class TwoSumTest {

    private int[] arr;

    @Before
    public void before() throws Exception {
        arr = new int[]{2, 7, 11, 15, 20, 30, 44, 65, 54};
    }

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] result1 = twoSum.twoSum(arr, 10);
        Assert.assertArrayEquals(null, result1);

        int[] result2 = twoSum.twoSum(arr, 50);
        Assert.assertArrayEquals(new int[]{4, 5}, result2);

        int[] result3 = twoSum.twoSum(arr, 51);
        Assert.assertArrayEquals(new int[]{1, 6}, result3);

    }
    @Test
    public void testTwoSum2() {
        TwoSum twoSum = new TwoSum();
        int[] result1 = twoSum.twoSum2(arr, 10);
        Assert.assertArrayEquals(null, result1);

        int[] result2 = twoSum.twoSum2(arr, 50);
        Assert.assertArrayEquals(new int[]{4, 5}, result2);

        int[] result3 = twoSum.twoSum2(arr, 51);
        Assert.assertArrayEquals(new int[]{1, 6}, result3);

    }

    @After
    public void after() throws Exception {
        arr = null;
    }


} 
