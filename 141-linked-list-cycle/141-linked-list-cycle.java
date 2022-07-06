// TC: O(N) SC: O(1)
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        if(fast == null || fast.next == null) {
            return false;
        }
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}