/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var step = 0
        var tempNode = head
        var middle = 0
        var result = head
        
        while (true) {
            if (tempNode!!.next == null) {
                break
            }
        
            step += 1
            tempNode = tempNode!!.next
        }
    
        if (step % 2 == 0) {
            middle = step / 2
        } else {
            middle = step / 2 + 1
        }
        
        for (i in 1 .. middle) {
            result = result!!.next
        }
        
        return result
    }
}