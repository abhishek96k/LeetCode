public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        return helper(slow,fast);
    }
    
    private static boolean helper(ListNode slow, ListNode fast){
        if(fast == null || fast.next == null){
            return false;
        }
        slow = slow.next;
        fast = fast.next.next;
        
        if(slow == fast){
            return true;
        }
        return helper(slow,fast);
    }
}