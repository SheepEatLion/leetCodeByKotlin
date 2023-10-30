class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        
        for (i in 0..nums.size-1) {
            if (nums[i] != `val`) {
                nums[index++] = nums[i]
            }
        }
        
        
        return index
    }
}