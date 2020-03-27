#encoding: utf-8

# Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
# Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

# 来源：力扣（LeetCode）
# 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
# 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


def removeDuplicates(arr):
    i = 0
    for j in range(len(arr)):
        if(arr[i] != arr[j]):
            i += 1
            arr[i] = arr[j]
    return i+1


nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

print(removeDuplicates(nums))
