package test.arrays;

import arrays.RemoveElement;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * RemoveElement Tester.
 *
 * @author IrvingRyan
 * @version 1.0
 * @since <pre>3月 28, 2020</pre>
 */
public class RemoveElementTest {

    /**
     * Method: removeElement(int[] nums, int val)
     */
    @Test
    public void testRemoveElement() throws Exception {
        int[] nums = {3, 2, 2, 3};
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};


        RemoveElement removeElement = new RemoveElement();
        Assert.assertEquals(2, removeElement.removeElement(nums, 2));
        Assert.assertEquals(5, removeElement.removeElement(nums2, 2));
    }


} 
