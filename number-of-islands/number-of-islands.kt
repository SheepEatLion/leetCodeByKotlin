import java.util.ArrayDeque

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var x = 0
        var y = 0
        val deque = ArrayDeque<Pair<Int, Int>>()
        val visited = Array(m){ BooleanArray(n) }
        var result = 0
        
        for (i in 0..m-1) {
            for (j in 0..n-1) {
                if (grid[i][j] == '1' && visited[i][j] == false) {
                    deque.add(Pair(i, j))
                    visited[i][j] = true
                    
                    while (!deque.isEmpty()) {
                        var pair = deque.poll()
                        y = pair.first
                        x = pair.second 
                        
                        if (x+1 < n && y < m && grid[y][x+1] == '1' && visited[y][x+1] == false) {
                            deque.add(Pair(y, x+1))
                            visited[y][x+1] = true
                        }
                        if (x-1 >= 0 && y < m && grid[y][x-1] == '1' && visited[y][x-1] == false) {
                            deque.add(Pair(y, x-1))
                            visited[y][x-1] = true
                        }
                        if (y+1 < m && x < n && grid[y+1][x] == '1' && visited[y+1][x] == false) {
                            deque.add(Pair(y+1, x))
                            visited[y+1][x] = true
                        }
                        if (y-1 >= 0 && x < n && grid[y-1][x] == '1' && visited[y-1][x] == false) {
                            deque.add(Pair(y-1, x))
                            visited[y-1][x] = true
                        }
                    }
                    
                    result++
                }
            }
        }
        
        return result
    }
}