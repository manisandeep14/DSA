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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode rev = null;
        ListNode temp;
        while(head.next != null){
            // if(rev == null){
            //     rev = head;
            //     head = head.next;
            //     rev.next = null;
            // }else{
            //     temp = head.next;
            //     head.next = rev;
            //     rev = head;
            //     head = temp;
            // }
            temp = head.next;
            head.next = rev;
            rev = head;
            head = temp;
            
        }

        head.next = rev;
        return head;
    }
}
