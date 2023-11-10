class Solution {
    fun isHappy(n: Int): Boolean {
        val hs = HashSet<Int>()
        var str = "$n"
        
        while (true) {
            var tempSum = 0
            for (item in str.toCharArray()) {
                var n1 = item.toString().toInt() 
                tempSum += n1 * n1
            }
            if (tempSum == 1) {
                return true
            }
            if (hs.contains(tempSum)) {
                return false
            }
            hs.add(tempSum)
            str = tempSum.toString()
        }
    }
}