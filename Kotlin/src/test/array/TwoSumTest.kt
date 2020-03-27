package test.array

import arrays.TwoSum
import org.junit.After
import org.junit.Assert.assertArrayEquals
import org.junit.Before
import org.junit.Test

class TwoSumTest {
    private var arr: IntArray? = null

    @Before
    @Throws(Exception::class)
    fun before() {
        arr = intArrayOf(2, 7, 11, 15, 20, 30, 44, 65, 54)
    }

    @Test
    fun testTwoSum() {
        val twoSum = TwoSum()
        val result1 = twoSum.twoSum(arr!!, 10)
        assertArrayEquals(null, result1)
        val result2 = twoSum.twoSum(arr!!, 50)
        assertArrayEquals(intArrayOf(4, 5), result2)
        val result3 = twoSum.twoSum(arr!!, 51)
        assertArrayEquals(intArrayOf(1, 6), result3)
    }

    @Test
    fun testTwoSum2() {
        val twoSum = TwoSum()
        val result1 = twoSum.twoSum2(arr!!, 10)
        assertArrayEquals(null, result1)
        val result2 = twoSum.twoSum2(arr!!, 50)
        assertArrayEquals(intArrayOf(4, 5), result2)
        val result3 = twoSum.twoSum2(arr!!, 51)
        assertArrayEquals(intArrayOf(1, 6), result3)
    }

    @After
    @Throws(Exception::class)
    fun after() {
        arr = null
    }

}