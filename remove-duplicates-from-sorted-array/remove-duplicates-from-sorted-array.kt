class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val list = ArrayList<Int>()
        var k = 0
        
        list.add(nums[0])
        k++
        
        for (i in 1..nums.size-1) {
            if (nums[i] != nums[i-1]) {
                list.add(nums[i])
                k++
            }
        }
        
        for (i in 0..list.size-1) {
            nums[i] = list[i]
        }
        
        return k
    }
}