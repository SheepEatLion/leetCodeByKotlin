class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = 0
        var temp = 0
        for (i in arr.size-1 downTo 0) {
            if (i+1 > arr.size-1) {
                max = arr[i]
                arr[i] = -1
            } else if (arr[i] > max) {
                temp = arr[i]
                arr[i] = max
                max = temp
            } else if (arr[i] <= max) {
                arr[i] = max
            }
        }
        
        return arr
    }
}