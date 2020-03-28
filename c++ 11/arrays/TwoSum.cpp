//  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//  You may assume that each input would have exactly one solution, and you may not use the same element twice.

//  来源：力扣（LeetCode）
//  链接：https://leetcode-cn.com/problems/two-sum
//  著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

#include <iostream>
#include <vector>

std::vector<int> twoSum(std::vector<int> &arr, int target)
{
    std::vector<int> indices;
    int arr_length = arr.size();
    for (int i = 0; i < arr_length; i++)
    {
        for (int j = i + 1; j < arr_length; j++)
        {
            if (target - arr[i] == arr[j])
            {
                indices.push_back(i);
                indices.push_back(j);
                return indices;
            }
        }
    }
    return indices;
}

int main()
{
    std::vector<int> nums = {2, 7, 11, 15, 20, 30, 44, 65, 54};
    std::vector<int> indices = twoSum(nums, 50);
    for (int i : indices)
    {
        std::cout << i << " ";
    }
    std::cout << std::endl;

    return 0;
}