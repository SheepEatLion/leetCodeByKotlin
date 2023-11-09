import java.util.ArrayDeque

class Solution {
    fun numSquares(n: Int): Int {
        val memo = ArrayList<Int?>()
        
        memo.add(0)
        
        for (i in 1..n) {
            memo.add(null)
            var j = 1
            while (j*j <= n) {
                if (i - j*j >= 0) {
                    if (memo[i] == null || memo[i]!! > memo[i - j*j]!!.plus(1)) {
                        memo[i] = memo[i - j*j]!!.plus(1)
                    }
                }
                j++
            }
        }
        
        return memo[n]!!
    }
}