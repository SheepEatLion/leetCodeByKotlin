class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, ArrayList<Int>>() // nums[i], [i, i-1, i-2 ...]
        val result = intArrayOf(0, 0)
        
        for (i in 0..nums.size-1) {
            if (map.contains(nums[i])) {
                map.get(nums[i])!!.add(i)
            } else {
                map.put(nums[i], arrayListOf(i))
            }
        }
        
        for (i in 0..nums.size-1) {
            if (map.contains(target-nums[i]) && map.get(target-nums[i])!![0] != i) {
                result[0] = i
                result[1] = map.get(target-nums[i])!![0]
            }
        }
        
        return result
    }
}