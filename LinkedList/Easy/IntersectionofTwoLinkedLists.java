// 160. Intersection of Two Linked Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //boundary check
    if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
        // // Create a hash set to store nodes from headA
        // Set<ListNode> nodeSet = new HashSet<>();

        // // Traverse and store nodes from headA in the hash set
        // ListNode nodeA = headA;
        // while (nodeA != null) {
        //     nodeSet.add(nodeA);
        //     nodeA = nodeA.next;
        // }

        // // Traverse headB and check if any of its nodes are in the hash set
        // ListNode nodeB = headB;
        // while (nodeB != null) {
        //     if (nodeSet.contains(nodeB)) {
        //         return nodeB; // Intersection found
        //     }
        //     nodeB = nodeB.next;
        // }

        // return null; // No intersection found
    }
}