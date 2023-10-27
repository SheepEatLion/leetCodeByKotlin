class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var max = 0
        for (item in nums) {
            if (item == 1) {
                count += 1
            } else if (item == 0) {
                max = findMax(max, count)
                count = 0
            }
        }
        max = findMax(max, count)
        
        return max
    }
    
    fun findMax(n1: Int, n2: Int): Int {
        if (n1 < n2) {
            return n2
        }
        
        return n1
    }
}