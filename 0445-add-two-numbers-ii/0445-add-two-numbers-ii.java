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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;  
        }
        Stack<Integer> s2=new Stack<>();
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;  
        }
        int carry=0;
        ListNode newHead=null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int n1=s1.isEmpty() ? 0 : s1.pop();
            int n2=s2.isEmpty() ? 0 : s2.pop();
            int temp=n1+n2+carry;
            ListNode newNode=new ListNode(temp%10);
            newNode.next=newHead;
            newHead=newNode;
            carry=temp/10;
        }
        return newHead; 
    }
}