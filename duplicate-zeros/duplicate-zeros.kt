class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        var result = IntArray(arr.size) { 0 }
        var index = 0
        for (item in arr) {
            if (index >= arr.size) {
                break
            }
            result[index] = item
            index += 1
            if (item == 0 && index < arr.size) {
                result[index] = item
                index += 1
            }
        }
        
        for (i in 0..arr.size-1) {
            arr[i] = result[i]
        }
    }
}