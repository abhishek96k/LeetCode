/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;
        if (head.next.next == null) {
            head.next = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        boolean skip = true;
        while (fast.next != null) {
            if (!skip) {
                slow = slow.next;
                skip = true;
            } else {
                skip = false;
            }
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}