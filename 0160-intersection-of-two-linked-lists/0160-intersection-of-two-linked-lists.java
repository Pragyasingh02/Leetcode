/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
    ListNode h1=headA;
        ListNode h2=headB;
        while(h1!=h2)
        {
            h1=h1==null?headB:h1.next;
            h2=h2==null?headA:h2.next;
        }
        return h1;
        
    }
}