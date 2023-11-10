class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hs = nums.toHashSet()
        
        if (hs.size != nums.size) {
            return true
        }
        
        return false
    }
}