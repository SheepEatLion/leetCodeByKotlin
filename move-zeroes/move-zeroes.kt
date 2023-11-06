class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var j = 0
        
        if (nums.size <= 1) {
            return
        }
        
        for (i in 0..nums.size-1) {
            if (nums[j] == 0) {
                if (nums[i] != 0) {
                    nums[j] = nums[i]
                    nums[i] = 0
                }
            } 
            if (nums[j] != 0) {
                j++
            }
        }
    }
}