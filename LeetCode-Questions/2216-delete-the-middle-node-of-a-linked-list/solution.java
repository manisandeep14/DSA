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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)return head = head.next;
        ListNode s = head;
        ListNode f = head;
        while(f.next !=null && f.next.next != null){
            f = f.next.next;
            if(f.next != null)s = s.next;
        }

        s.next = s.next.next;

        return head;
    }
}
