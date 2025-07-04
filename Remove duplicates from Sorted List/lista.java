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
class lista {
    public ListNode deleteDuplicates(ListNode head) {
        // Caso base: lista vuota o con un solo elemento
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Salta il nodo duplicato
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
