public class MergeSortedLists {
    private static ListNode head1;
    private static ListNode head2;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        ListNode mergedHead = new ListNode(0);
        ListNode current = mergedHead;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If one of the lists is not empty, add the remaining elements
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Skip the dummy node at the beginning
        return mergedHead.next;
    }

    static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        System.out.println("List 1:");
        display(head1);

        System.out.println("List 2:");
        display(head2);

        ListNode mergedList = mergeSortedLists(head1, head2);

        System.out.println("Merged List:");
        display(mergedList);
    }
}
