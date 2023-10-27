class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var result = IntArray(nums.size) { 0 }
        for (i in 0..nums.size-1) {
            result[i] = square(nums[i])
        }
        result.sort()
        
        return result
    }
    
    fun square(num: Int): Int {
        return num * num
    }
}