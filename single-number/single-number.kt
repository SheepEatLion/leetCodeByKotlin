class Solution {
    fun singleNumber(nums: IntArray): Int {
        val hs = HashSet<Int>()
        
        for (item in nums) {
            if (!hs.contains(item)) {
                hs.add(item)
            } else (
                hs.remove(item)
            )
        }
        
        for (item in nums) {
            if (hs.contains(item)) {
                return item
            }
        }
        
        return 0
    }
}