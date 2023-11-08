class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        var max = 0
        val arr = nums.copyOf()
        
        arr.sort()
        
        for (i in 0..arr.size-1 step 2) {
            max += minOf(arr[i], arr[i+1])
        }
        
        return max
    }
}