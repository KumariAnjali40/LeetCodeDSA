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
        int length = 0;

        ListNode curr = head;

        ListNode prev = null;

        while(curr != null){
           ListNode frontNode = curr.next;
             curr.next = prev;
             prev = curr;
             curr = frontNode;
        }

        return prev;


    }
}