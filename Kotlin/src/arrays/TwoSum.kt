package arrays

import java.util.*

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *
 * Example:
 *
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class TwoSum {
    /**
     * Caculate results
     * Using array
     * Time complexity O(n^2)
     *
     * @param arr    data need to caculate
     * @param target sum's target
     * @return indices result
     */
    fun twoSum(arr: IntArray, target: Int): IntArray? {
        val lenght = arr.size
        for (i in 0 until lenght) {
            for (j in i + 1 until lenght) {
                if (target - arr[i] == arr[j]) {
                    return intArrayOf(i, j)
                }
            }
        }
        return null
    }

    /**
     * Caculate results
     * Using hash map , faster than first , but need every number is unique.
     * Time complexity O(n)
     *
     * @param arr    data need to caculate
     * @param target sum's target
     * @return indices result
     */
    fun twoSum2(arr: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int?>()
        for (i in arr.indices) {
            map[arr[i]] = i
        }
        for (integer in map.keys) {
            val num = target - integer
            if (map.containsKey(num)) {
                return intArrayOf(map[integer]!!, map[num]!!)
            }
        }
        return null
    }
}