class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var nums = digits.copyOf()
        
        var right = nums.size-1
        while (right > -1) {
            nums[right] += 1
            if (nums[right] >= 10) {
                nums[right] = 0
                if (right == 0) {
                    return addSpace(nums)
                }
                right -= 1
            } else {
                break
            }
        }
        
        return nums
    }
    fun addSpace(arr: IntArray): IntArray {
        var temp = IntArray(arr.size+1)
        
        temp[0] = 1
        for (i in 1..temp.size-1) {
            temp[i] = arr[i-1]
        }
        
        return temp
    }
}