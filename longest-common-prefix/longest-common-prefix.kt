class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val minStr = strs.minBy { it.length }
        var ch = ""
        var result = ""
        var flag = true
        for (c in minStr.toCharArray()) {
            ch += c.toString()
            
            for (s in strs) {
                if (!s.startsWith(ch)) {
                    flag = false
                    break
                }
            }
            
            if (flag) {
                result = ch
            } else {
                break
            }
        }
        return result
    }
}