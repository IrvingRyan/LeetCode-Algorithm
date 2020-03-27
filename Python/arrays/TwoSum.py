#encoding: utf-8

'''
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/two-sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
'''


def twoSum(arr, target):
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            if(target - arr[i] == arr[j]):
                return i, j
    return None


nums = [3, 2, 4]

print(twoSum(nums, 6))
