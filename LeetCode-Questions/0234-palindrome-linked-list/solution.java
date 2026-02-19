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
    public boolean isPalindrome(ListNode head) {

        // ListNode temp = head;

        // int count = 0;

        // while(temp != null){
        //     temp = temp.next;
        //     count += 1;
        // }

        // int[] arr =  new int[count];
        // temp = head;
        // int index = 0;

        // while(temp != null){
        //     arr[index] = temp.val;
        //     index += 1;
        //     temp = temp.next;
        // }

        // int i = 0;
        // int j = arr.length-1;

        // while(i <= count/2){
        //     if(arr[i] != arr[j]) return false;
        //     i++;
        //     j--;
        // }

        // return true;

        if(head == null) return false;
        if(head.next == null) return true;

        ListNode s = head;
        ListNode f = head;
        //middle element
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        
        ListNode head1 = s.next;
        ListNode temp1;
        ListNode rev = null;
        //reverse elements
        while(head1 != null){
            temp1 = head1.next;
            head1.next = rev;
            rev = head1;
            head1 = temp1;
        }
        
        s = rev;
            // System.out.print(s.val+" ");
            // System.out.println(s.val+" ");
        

        temp1 = head;
        while(s != null){
            if(temp1.val != s.val){
                // System.out.print(temp1.val+" "+s.val);
                return false;
            }
            s = s.next;
            temp1 = temp1.next;
        }
        return true;
    

    }
}
