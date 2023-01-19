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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null, curr=head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        if(head==null){
            return true;
        }
        ListNode mid=middle(head);
        ListNode last=reverse(mid);
        ListNode cur=head;
        
        while(last!=null){
            if(last.val!=cur.val){
                return false;
            }
            last=last.next;
            cur=cur.next;
        }
        return true;
    }
}