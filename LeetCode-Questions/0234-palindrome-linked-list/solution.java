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

        ListNode temp = head;

        int count = 0;

        while(temp != null){
            temp = temp.next;
            count += 1;
        }

        int[] arr =  new int[count];
        temp = head;
        int index = 0;

        while(temp != null){
            arr[index] = temp.val;
            index += 1;
            temp = temp.next;
        }

        int i = 0;
        int j = arr.length-1;

        while(i <= count/2){
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }

        return true;

    }
}
