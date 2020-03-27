package arrays;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {


    /**
     * Caculate results
     * Using array
     * Time complexity O(n^2)
     *
     * @param arr    data need to caculate
     * @param target sum's target
     * @return indices result
     */
    public int[] twoSum(int[] arr, int target) {
        int lenght = arr.length;
        for (int i = 0; i < lenght; i++) {
            for (int j = i + 1; j < lenght; j++) {
                if ((target - arr[i]) == arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
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
    public int[] twoSum2(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (Integer integer : map.keySet()) {
            int num = target - integer;
            if (map.containsKey(num)) {
                return new int[]{map.get(integer), map.get(num)};
            }
        }
        return null;
    }

}
