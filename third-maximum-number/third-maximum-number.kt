class Solution {
    fun thirdMax(nums: IntArray): Int {
        var first: String = ""
        var second: String = ""
        var third: String = ""
        
        val copyNums = nums.copyOf().toSet().toTypedArray()
        
        if (copyNums.size < 3) {
            for (i in 0..copyNums.size-1) {
                if (first == "" || first.toInt() < copyNums[i]) {
                    first = copyNums[i].toString()
                }
            }
            return first.toInt()
        }
        
        for (i in 0..copyNums.size-1) {
            if (first == "" || copyNums[i] > first.toInt()) {
                third = second
                second = first
                first = copyNums[i].toString()
            } else if (second == "" || copyNums[i] > second.toInt()) {
                third = second
                second = copyNums[i].toString()
            } else if (third == "" || copyNums[i] > third.toInt()) {
                third = copyNums[i].toString()
            }
        }
        
        return third.toInt()
    }
}