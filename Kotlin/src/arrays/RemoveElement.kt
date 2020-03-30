package arrays

import java.util.Arrays

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class RemoveElement {
    /**
     * remove element
     *
     * @param nums arrays that need to be processed
     * @param val  number that needs to be removed
     * @return new length of array
     */
    fun removeElement(nums: IntArray, removeNum: Int): Int { //length of array
        var length = nums.size
        var i = 0
        while (i < length) {
            if (removeNum == nums[i]) {
                //The order of elements can be changed，so put last one before
                nums[i] = nums[length - 1]
                length--
            } else {
                i++
            }
        }
        return length
    }
}