class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 1
        var u = 0
        
        for (i in 0..nums.size-1) {
            nums[i] = nums[u]
            
            while (u < nums.size-1) {
                u++
                if (nums[u] != nums[i]) {
                    k++
                    break
                }
            }
        }
        
        return k
    }
}