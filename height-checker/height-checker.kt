class Solution {
    fun heightChecker(heights: IntArray): Int {
        val copyHeights = heights.copyOf()
        var count = 0
        
        copyHeights.sort()
        
        for (i in 0..heights.size-1) {
            if (copyHeights[i] != heights[i]) {
                count++
            }
        }
        
        return count
    }
}