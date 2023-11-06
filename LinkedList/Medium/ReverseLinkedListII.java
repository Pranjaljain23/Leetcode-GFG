// 92. Reverse Linked List II

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftpre = dummy;
        ListNode curr = head;

        for(int i = 0; i < left - 1; i++) {
            leftpre = leftpre.next;
            curr = curr.next;
        }

        ListNode sublistHead = curr;
        ListNode prev = null;
        ListNode next;

        for(int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        leftpre.next = prev;
        sublistHead.next = curr;

        return dummy.next;
    }
}