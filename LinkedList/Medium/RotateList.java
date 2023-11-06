// 61. Rotate List

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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = head;

        if(head == null || head.next == null || k == 0) {
            return head;
        }

        while(curr != null) {
            size++;
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = head;
        curr = head;

        k = k % size;
        for(int i = 0; i < size - k - 1; i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;


        return head;
    }
}