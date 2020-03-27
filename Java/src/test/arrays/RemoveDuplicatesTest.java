package test.arrays;

import arrays.RemoveDuplicates;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * RemoveDuplicates Tester.
 *
 * @author IrvingRyan
 * @version 1.0
 * @since <pre>3月 27, 2020</pre>
 */
public class RemoveDuplicatesTest {

    /**
     * Method: removeDuplicates(int[] arr)
     */
    @Test
    public void testRemoveDuplicates() throws Exception {
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        Assert.assertEquals(2, removeDuplicates.removeDuplicates(arr1));
        Assert.assertEquals(5, removeDuplicates.removeDuplicates(arr2));
    }
} 
