/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    
    public ListNode swapPairs(ListNode node) {
        
           if (node == null || node.next == null) {
            return node;
        }
 
        
        ListNode remaining = node.next.next;
        ListNode newhead = node.next;
        node.next.next = node;
        node.next = swapPairs(remaining);
        return newhead;
        
        
        
    }
    
    
}
