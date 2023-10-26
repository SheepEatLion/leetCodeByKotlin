class Solution {
    fun numberOfSteps(num: Int): Int {
        var temp = num
        var step = 0

        while(temp > 0) {
            when (temp % 2) {
                0 -> { temp = temp.div(2) }
                1 -> { temp -= 1 }
            }

            step += 1
        }

        return step
    }
}