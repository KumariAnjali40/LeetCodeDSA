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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode curr = head;

        ArrayList<Integer> list = new ArrayList<>();

        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        int n = list.size();

        for(int i = 0; i <= n-k; i+=k){
            Collections.reverse(list.subList(i, i + k));
        }

        ListNode newHead = new ListNode(0);

        ListNode dummy = newHead;

        for(int val : list){
            dummy.next = new ListNode(val);
            dummy = dummy.next;
        }

        return newHead.next;

    }
}