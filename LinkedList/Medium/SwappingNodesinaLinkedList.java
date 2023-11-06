// 1721. Swapping Nodes in a Linked List

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
    public ListNode swapNodes(ListNode head, int k) {
        //Took 1ms
        ListNode curr = head, first = head, second = head;

        for(int i=1;i<k;i++) {
            curr=curr.next;
        }

        first=curr;

        while(curr.next!=null){
            second=second.next;
            curr=curr.next;
        }

        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        return head;


        //Took 2ms because i am iterating through list for size then for pointers to be on their places 
        // int size = 0;
        // ListNode curr = head;

        // while(curr != null) {
        //     size++;
        //     curr = curr.next;
        // }

        // ListNode first = head;
        // ListNode second = head;

        // for(int i = 0; i < k - 1; i++) {
        //     first = first.next;
        // }

        // for(int i = 0; i < size - k; i++) {
        //     second = second.next;
        // }

        // int temp = first.val;
        // first.val = second.val;
        // second.val = temp;

        // return head;
    }
}