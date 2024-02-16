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
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to simplify the code
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        // Iterate through the list and swap adjacent pairs
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swap the pairs
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move to the next pair
            current = current.next.next;
        }

        return dummy.next; // Return the updated head
    }
}
