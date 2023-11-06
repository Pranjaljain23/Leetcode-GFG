// 19. Remove Nth Node From End of List

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
        if(head == null) {
            return null;
        }

        ListNode newNode = new ListNode(0);
        newNode.next = head;
        int size = 0;
        ListNode temp = head;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        temp = newNode;

        for(int i = 0; i < size - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return newNode.next;
    }
}