class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var k = 0
        var temp = 0
        
        for (i in 0..nums.size-1) {
            if (nums[k] % 2 == 1) {
                if (nums[i] % 2 == 0) {
                    temp = nums[k]
                    nums[k] = nums[i]
                    nums[i] = temp
                }
            }
            if (nums[k] % 2 == 0) {
                k++
            }
        }
        
        return nums
    }
}