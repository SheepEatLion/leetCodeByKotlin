class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        // 매거진의 글자와 글자 수를 매핑시켜둔다.
        // ex) a = 3, b = 2, c = 2 ..
        // 랜섬노트의 각 글자를 순회하면서 맵을 조회하여 하나씩 지워간다.
        // 맵에 없는 글자가 나오거나, 더 이상 남은 게 없는 글자가 나올 경우 종료한다.
        
        val map = hashMapOf<String, Int>()
        
        for (letter in magazine) {
            var temp = letter.toString()
            if (map.containsKey(temp)) {
                map[temp] = map[temp]!!.plus(1)
            } else {
                map[temp] = 1
            }
        }
        
        for (letter in ransomNote) {
            var temp = letter.toString()
            if (map[temp] == null || map[temp] == 0) {
                return false
            }
            map[temp] = map[temp]!!.minus(1)
        }
        
        return true
    }
}