package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveDuplicates {
    /**
     * remove array's duplicate number
     *
     * @param arr array
     * @return length of no duplicate array
     */
    public int removeDuplicates(int[] arr) {
        //record last different number
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                //put different number to recorded postion's next postion
                arr[i] = arr[j];
            }
        }
        //length is last number +1
        //array's actual length still not change
        System.out.println(Arrays.toString(arr));
        return i + 1;
    }
}
