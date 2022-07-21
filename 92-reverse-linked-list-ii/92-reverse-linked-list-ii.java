class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        
        ListNode curr = head, prev = null;
        while(left > 1){
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        
        ListNode p1 = prev, p2 = curr;
        
        ListNode third = null;
        
        while(right > 0){
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            right--;
        }
        
        if(p1 != null){
            p1.next = prev;
        } else {
            head = prev;
        }
        
        p2.next = curr;
        return head;
    }
}