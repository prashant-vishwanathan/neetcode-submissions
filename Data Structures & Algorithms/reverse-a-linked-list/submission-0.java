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
        ListNode prevNode = null;
        ListNode currNode;
        ListNode tempNode;

        currNode = head;

        if (currNode == null) {
            // No element exists
            return head;
        } else {
            while (currNode != null) {
               tempNode = currNode.next;
               currNode.next = prevNode;
               prevNode = currNode;
               currNode = tempNode;
            }

            return prevNode;
          
        }
    }
}
