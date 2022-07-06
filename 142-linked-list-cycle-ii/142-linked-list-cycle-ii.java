// TC : O(N) SC: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head, fast = head, start = null;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                start = head;
                while(start != slow){
                    start = start.next;
                    slow = slow.next;
                }
                break;
            }
        }
        return start;
    }
}