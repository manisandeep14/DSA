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
    public int pairSum(ListNode head) {
        if(head.next.next == null) return head.val + head.next.val;

        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = slow.next;
        slow.next = null;

        //reverse the second

        ListNode prev = null;
        ListNode crr = second;
        while(crr!= null){
            ListNode next = crr.next;
            crr.next = prev;
            prev = crr;
            crr = next;
        }
        //find twin max
        second = prev;
        int twinMax = 0;
        while(second != null){
            twinMax = Math.max(twinMax,first.val+second.val);

            first = first.next;
            second = second.next;
        }
        return twinMax;
    }
}
