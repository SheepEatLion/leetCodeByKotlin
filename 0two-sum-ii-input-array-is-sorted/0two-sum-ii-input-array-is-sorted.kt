class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size-1
        val result = IntArray(2) { 0 }
        
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1
                result[1] = right + 1
                break
            }
            if (numbers[left] + numbers[right] > target) {
                right--
            } else if (numbers[left] + numbers[right] < target) {
                left++
            }
        }
        
        return result
    }
}