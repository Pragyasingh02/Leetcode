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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
          ListNode fast = head;
          ListNode slow = head;
          ListNode res = slow;
          for(int i=1;i<n;i++)
               fast = fast.next;
         while(fast.next!=null)
            {
           res = slow;
           slow = slow.next;
           fast = fast.next;
            }
          if(slow==head) head=head.next;
          res.next = slow.next;
          return head;

    }
}