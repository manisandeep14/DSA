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
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i = 0; i<=n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
        /*ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count == n)return head.next;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null){
            if(count-1 == n){
                slow.next  = fast.next;
                break;
            }
            count--;
            slow = slow.next;
            fast = fast.next;
        }
        return head;
        */
