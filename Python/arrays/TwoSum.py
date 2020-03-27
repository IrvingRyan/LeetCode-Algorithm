def twoSum(arr, target):
    for i in range(len(arr)):
        for j in range(len(arr)):
            if(target - arr[i] == arr[j]):
                return i,j
    return None

nums = [2, 3, 5, 8, 10, 30, 40, 33, 89, 103]

print(twoSum(nums, 50))
