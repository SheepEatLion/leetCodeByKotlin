class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val n = nums.size
        val result = ArrayList<Int>()
        
        for (i in 1..n) {
            if (!nums.contains(i)) {
                result.add(i)
            }
        }
        
        return result
    }
}