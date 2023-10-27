class Solution {
    fun findNumbers(nums: IntArray): Int {
        // 몫이 없어질 때까지 10으로 나눈다.
        // 10으로 나누는 횟수를 임시 카운트 한다.
        // 10으로 짝수 번 나눴다면 최종 카운트 한다.
        var finalCount = 0
        
        for (item in nums) {
            var tempCount = 0
            var tempValue = item
            
            while (tempValue > 0) {
                tempValue /= 10
                tempCount += 1
            }
            
            if (tempCount % 2 == 0) {
                finalCount += 1
            }
        }
        
        return finalCount
    }
}