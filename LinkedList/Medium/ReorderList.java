// 143. Reorder List


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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // ListNode midNode = slow;

        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode rightHead = prev;
        ListNode nextRight = prev;
        ListNode leftHead = head;
        ListNode nextLeft = head;

        while(nextRight != null) {
            nextRight = rightHead.next;
            nextLeft = leftHead.next;
            leftHead.next = rightHead;
            rightHead.next = nextLeft;
            rightHead = nextRight;
            leftHead = nextLeft;
        }
    }
}