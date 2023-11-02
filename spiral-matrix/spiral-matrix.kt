class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val m = matrix.size
        val n = matrix[0].size
        var x = 0
        var y = 0
        val visited = Array(m) { BooleanArray(n) }
        val result = ArrayList<Int>()
        var dir = false
        
        while (result.size < m*n) {
            dir = !dir
            if (dir) {
                for (i in 0..n-1) {
                    if (visited[y][i]){
                        continue
                    }
                    result.add(matrix[y][i])
                    visited[y][i] = true
                    x = i
                }
                for (j in 0..m-1) {
                    if (visited[j][x]){
                        continue
                    }
                    result.add(matrix[j][x])
                    visited[j][x] = true
                    y = j
                }
            } else {
                for (i in n-1 downTo 0) {
                    if (visited[y][i]) {
                        continue
                    }
                    result.add(matrix[y][i])
                    visited[y][i] = true
                    x = i
                }
                for (j in m-1 downTo 0) {
                    if (visited[j][x]){
                        continue
                    }
                    result.add(matrix[j][x])
                    visited[j][x] = true
                    y = j
                }
            }
        }
        return result
    }
}