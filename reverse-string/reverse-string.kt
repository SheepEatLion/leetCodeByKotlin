class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size-1
        var temp: Char
        
        if (s.size == 1) {
            return
        }
        
        while (left < right) {
            temp = s[left]
            s[left] = s[right]
            s[right] = temp
            
            left++
            right--
        }
    }
}