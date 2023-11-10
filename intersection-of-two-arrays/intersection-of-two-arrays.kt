class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val hs1 = nums1.toHashSet()
        val hs2 = nums2.toHashSet()
        
        return hs1.intersect(hs2).toIntArray()
    }
}