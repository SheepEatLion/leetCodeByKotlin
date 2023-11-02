class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        
        for (i in 0..numRows-1) {
            result.add(arrayListOf(1))
        }
        
        if (numRows == 1) {
            return result
        }
        
        for (i in 1..numRows-1) {
            for (j in 1..i) {
                if (j == i) {
                    result[i].add(1)
                } else if (j-1 >= 0) {
                    result[i].add(result[i-1][j-1] + result[i-1][j])
                }
            }
        }
        return result
    }
}