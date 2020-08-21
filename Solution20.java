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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        
        ListNode p1 = head;
        ListNode p2 = head;
        
        //mid point using 2 pointers
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        //reverse other half
        ListNode prev = null;
        ListNode curr = p1;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode h1 = head;
        ListNode h2 = prev;
        
        //merge
        while(h1 != null){
            next = h1.next;
            h1.next = h2;
            h1 = h2;
            h2 = next;
        } 
    }
}
