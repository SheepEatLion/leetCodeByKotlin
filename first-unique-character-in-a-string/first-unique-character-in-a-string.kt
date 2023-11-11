class Solution {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()
        var arr = s.toCharArray()
        var min = -1
        
        for (i in arr.indices) {
            if (map.contains(arr[i])) {
                map[arr[i]] = -1
            } else {
                map[arr[i]] = i
            }
        }
        
        for (entry in map) {
            if (entry.value != -1) {
                if (min == -1 || entry.value < min) {
                    min = entry.value
                }
            }
        }
        
        return min
    }
}