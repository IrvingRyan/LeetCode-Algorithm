package test.array

import arrays.RemoveDuplicates
import org.junit.Assert.assertEquals
import org.junit.Test

class RemoveDuplicatesTest {

    @Test
    fun removeDuplicatesTest() {
        val arr1 = intArrayOf(1, 1, 2)
        val arr2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val removeDuplicates = RemoveDuplicates()
        assertEquals(2, removeDuplicates.removeDuplicates(arr1).toLong())
        assertEquals(5, removeDuplicates.removeDuplicates(arr2).toLong())    }
}