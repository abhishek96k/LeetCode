class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode node = head;         
        int count = 0;
        while(count < k){
            if(node == null) return head;
            node = node.next;
            count++;
        }
        ListNode pre = reverseKGroup(node, k);
        while(count > 0){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            count = count - 1;
        }
        return pre;
        
    }
}