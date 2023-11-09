import java.util.ArrayDeque

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val map = HashMap<Char, Char>()
        
        map.put('[', ']')
        map.put('(', ')')
        map.put('{', '}')
        
        for (ch in s.toCharArray()) {
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch)
            } else if (stack.isEmpty()) {
                return false
            } else if (map[stack.pop()] != ch) {
                return false 
            }
        
        }
        if (stack.isEmpty()) {
            return true
        }
        return false
    }
}