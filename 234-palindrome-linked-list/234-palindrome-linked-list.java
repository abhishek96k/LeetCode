
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        
        ListNode p1 = head, p2 = head;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        ListNode temp = null, prev = null, curr = head;
        while(curr != p1){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        if(p2 != null && p2.next == null)
            p1 = p1.next;
        
        while(p1 != null){
            if(p1.val != prev.val) return false;
            p1 = p1.next;
            prev = prev.next;
        }
        return true;
    }
}