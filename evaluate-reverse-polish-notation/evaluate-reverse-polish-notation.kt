import java.util.ArrayDeque

class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        
        for (str in tokens) {
            if (str.length == 1 && str == "*" || str == "+" || str == "/" || str == "-") {
                var n1 = stack.pop()
                var n2 = stack.pop()
                
                stack.push(calculate(n2, str, n1))
            } else {
                stack.push(str.toInt())
            }
        }
        
        return stack.pop().toInt()
    }
    
    fun calculate(a: Int, op: String, b: Int): Int {
        when (op) {
            "*" -> return a * b
            "/" -> return a / b
            "+" -> return a + b
            "-" -> return a - b
        }
        
        return 0
    }
}