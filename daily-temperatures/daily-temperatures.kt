import java.util.ArrayDeque

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val result = IntArray(temperatures.size){ 0 }
        
        for (i in 0..temperatures.size-2) {
            stack.push(i)
            
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i+1]) {
                var index = stack.pop()
                result[index] = i - index + 1
            }   
        }
        
        return result
    }
}