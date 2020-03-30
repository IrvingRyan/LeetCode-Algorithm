
// # Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
// # Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// # 来源：力扣（LeetCode）
// # 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
// # 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

#include <iostream>
#include <vector>

int removeDuplicates(std::vector<int> &arr)
{
    int i = 0;
    //j is fast pointer
    for (int j = 1; j < arr.size(); j++)
    {
        if (arr[j] != arr[i])
        {
            //i is slow pointer
            i++;
            arr[i] = arr[j];
        }
    }
    return i + 1;
}

int main()
{
    std::vector<int> nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int length = removeDuplicates(nums);
    std::cout << "new length is " << length << std::endl;
    return 0;
}