#encoding: utf-8

'''
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
'''


def removeElement(arr, target):
    i = 0
    length = len(arr)
    while(i < length):
        if(target == arr[i]):
            # The order of elements can be changed，so put last one before
            arr[i] = arr[length-1]
            length -= 1
        else:
            i += 1
    return length


nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

print(removeElement(nums, 3))
