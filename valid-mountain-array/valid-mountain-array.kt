class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        var dir = true
        
        if (arr.size < 3) {
            return false
        }
        
        if (arr[0] > arr[1]) {
            return false
        }
        
        for (i in 1..arr.size-1) {
            if (arr[i] == arr[i-1]) {
                return false
            }
            if (dir && arr[i] < arr[i-1]) {
                dir = !dir
            } else if (!dir && arr[i] > arr[i-1]) {
                return false
            }
        }
        
        return !dir
    }
}