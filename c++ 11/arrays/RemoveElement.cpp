/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

#include <iostream>
#include <vector>

int removeElement(std::vector<int> vec, int val)
{
    int i = 0;
    int length = vec.size();
    while (i < length)
    {
        if (vec[i] == val)
        {
            //  The order of elements can be changed，so put last one before
            vec[i] = vec[length - 1];
            length--;
        }
        else
        {
            i++;
        }
    }
    return length;
}

int main()
{
    std::vector<int> nums = {1, 3, 4, 5, 6, 6, 6, 7, 8};
    std::cout << "new length is " << removeElement(nums, 6) << std::endl;
    return 0;
}