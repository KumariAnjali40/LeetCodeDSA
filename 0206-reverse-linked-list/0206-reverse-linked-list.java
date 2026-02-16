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
        // ListNode prev = null;

        // ListNode curr = head;

        // while(curr != null){
        //     ListNode next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // return prev;

        List<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        if(list.size() == 0) {
            return null;
        }

        ListNode newHead = new ListNode(list.get(list.size()-1));

        ListNode newList = newHead;

        for(int i = list.size()-2; i >=0; i--){
            newList.next = new ListNode(list.get(i));
            newList = newList.next;
        }

        return newHead;

    }
}