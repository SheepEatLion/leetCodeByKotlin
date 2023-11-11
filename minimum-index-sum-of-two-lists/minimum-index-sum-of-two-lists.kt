class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val indexMap = HashMap<String, Int>()
        val result = HashMap<Int, ArrayList<String>>()

        for (i in list2.indices) {
            indexMap[list2[i]] = i
        }
        
        for (i in list1.indices) {
            if (indexMap.contains(list1[i])) {
                var tempSum: Int = indexMap[list1[i]]!! + i
                
                if (!result.contains(tempSum)) {
                    result[tempSum] = arrayListOf(list1[i])
                } else {
                    result[tempSum]?.add(list1[i])
                }
            }
        }
        
        return result[result.keys.minOrNull()]?.toTypedArray() ?: emptyArray()
    }
}