class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var result = -1
        
        for (p in 0..nums.size-1) {
            var leftSum = 0
            var rightSum = 0
            
            if (p != 0) {
                for (i in 0..p-1) {
                    leftSum += nums[i]
                }
            }
            
            if (p != nums.size-1) {
                for (j in p+1..nums.size-1) {
                    rightSum += nums[j]
                }
            }
            
            if (leftSum == rightSum) {
                result = p
                break
            }
        }
        
        return result
    }
}