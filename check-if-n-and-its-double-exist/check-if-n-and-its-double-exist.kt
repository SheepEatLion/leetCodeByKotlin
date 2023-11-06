class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        
        for (i in 0..arr.size-1) {
            map.put(arr[i], i)
        }
        
        for (i in 0..arr.size-1) {
            if (map.get(arr[i] * 2) != null) {
                if (map.get(arr[i] * 2) != i) {
                    return true
                }
            }
        }
        
        return false
    }
}