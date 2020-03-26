package arrays;

import java.util.Arrays;

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
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15, 20, 30, 44, 65, 54};
        int[] a = caculate(arr, 50);
        int[] b = caculate(arr, 51);
        int[] c = caculate(arr, 52);
        printRestults(a);
        printRestults(b);
        printRestults(c);
    }

    /**
     * print results
     *
     * @param indices results that need to print
     */
    private static void printRestults(int[] indices) {
        if (indices == null) {
            System.out.println("No Result");
        } else {
            System.out.println("indices are " + Arrays.toString(indices));
        }
    }

    /**
     * caculate results
     *
     * @param arr    data need to caculate
     * @param target sum's target
     * @return
     */
    public static int[] caculate(int[] arr, int target) {
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

}
