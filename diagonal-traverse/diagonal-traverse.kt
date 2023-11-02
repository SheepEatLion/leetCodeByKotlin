import java.util.ArrayDeque

class Solution {
    data class Coordinate(val x: Int, val y: Int)
    
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val m = mat.size
        val n = mat[0].size
        var result = IntArray(m * n)
        val stack = ArrayDeque<Coordinate>()
        val queue = ArrayDeque<Coordinate>()
        val visited = Array(m) { BooleanArray(n) }
        var index = 0
        var dir = false
        
        stack.push(Coordinate(0, 0))
        visited[0][0] = true
        
        while (stack.isNotEmpty() || queue.isNotEmpty()) {
            dir = !dir
            
            while (stack.isNotEmpty()) {
                val head = stack.pop()
                result[index] = mat[head.x][head.y]
                index++
                
                if (dir) {
                    if (head.x+1 < m && !visited[head.x+1][head.y]) {
                        queue.add(Coordinate(head.x+1, head.y))
                        visited[head.x+1][head.y] = true
                        println(1)
                    }
                    if (head.y+1 < n && !visited[head.x][head.y+1]) {
                        queue.add(Coordinate(head.x, head.y + 1))
                        visited[head.x][head.y+1] = true
                        println(2)
                    }
                } else {
                    if (head.y+1 < n && !visited[head.x][head.y+1]) {
                        queue.add(Coordinate(head.x, head.y+1))
                        visited[head.x][head.y+1] = true
                        println(3)
                    }
                    if (head.x+1 < m && !visited[head.x+1][head.y]) {
                        queue.add(Coordinate(head.x+1, head.y))
                        visited[head.x+1][head.y] = true
                        println(4)
                    }
                }
            }
            
            while (queue.isNotEmpty()) {
                stack.push(queue.poll())
            }
        }
        
        return result
    }
}