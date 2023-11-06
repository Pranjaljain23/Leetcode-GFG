// 83. Remove Duplicates from Sorted List

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }

            //Below code was there when i didn't  put the else condition so these two ifs are replaced by single else statement
            // if(temp.next == null) {
            //     return head;
            // }
            // if(temp.val != temp.next.val) {
            //     temp = temp.next;
            // }
        }

        return head;
    }
}