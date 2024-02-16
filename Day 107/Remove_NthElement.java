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
        // Create a dummy node to handle cases where the head needs to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move the second pointer to the N+1th node
        for (int i = 0; i <= n; i++) {
            second = second.next;
        }

        // Move both pointers until the second pointer reaches the end
        while (second != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the N-th node from the end
        first.next = first.next.next;

        return dummy.next; // Return the updated head
    }
}
