import java.util.ArrayDeque

class Solution {
    fun openLock(deadends: Array<String>, target: String): Int {
        var temp: String
        val q = ArrayDeque<String>()
        val visited = HashSet<String>()
        var count = 0
        var result: Int = -1
        q.add("0000")
        
        while (!q.isEmpty()) {
            for (i in 0 until q.size){
                temp = q.poll()
                
                if (deadends.contains(temp) || visited.contains(temp)) {
                    continue
                }
                
                if (temp == target) {
                    return count
                }
                
                for (i in 0..3) {
                    var plus = q.add(up(temp.toCharArray(), i))
                    var minus = q.add(down(temp.toCharArray(), i))
                }
                
                visited.add(temp)
            }
            count ++
        }
        
        return result
    }
    
    fun up(arr: CharArray, index: Int): String {
        if (arr[index] == '9') {
            arr[index] = '0'
        } else {
            arr[index] = (arr[index].toInt() + 1).toChar()
        }
        return String(arr)
    }
    
    fun down(arr: CharArray, index: Int): String {
        if (arr[index] == '0') {
            arr[index] = '9'
        } else {
            arr[index] = (arr[index].toInt() - 1).toChar()
        }
        
        return String(arr)
    }
}