// 1290. Convert Binary Number in a Linked List to Integer


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
    public int getDecimalValue(ListNode head) {
        int size = -1;
        ListNode temp = head;
        int decimal = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            decimal += temp.val * (Math.pow(2, size--));
            temp = temp.next; 
        }

        return decimal;
    }
}