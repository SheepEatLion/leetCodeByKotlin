class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var arr = nums.copyOf()

        arr.sort()
        
        if (arr[arr.size-2] * 2 <= arr[arr.size-1]) {
            return nums.indexOf(arr[arr.size-1])
        }
        
        return -1
    }
}