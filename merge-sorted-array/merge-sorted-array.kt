class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = 0
        var j = 0
        var k = 0
        var result = IntArray(m+n) { 0 }
        
        if (m+n == 0) {
            return;
        }
        
        if (nums2.size == 0) {
            return;
        }
        
        for (k in 0..m+n-1) {
            if (i >= m) {
                result[k] = nums2[j]
                j += 1
            } else if (j >= n) {
                result[k] = nums1[i]
                i += 1
            } else if (j < n && i < m && nums2[j] < nums1[i]) {
                result[k] = nums2[j]
                j += 1
            } else if (i < m && j < n && nums1[i] <= nums2[j] ) {
                result[k] = nums1[i]
                i += 1
            }
        }
        
        for (k in 0..m+n-1) {
            nums1[k] = result[k]
        }
    }
}