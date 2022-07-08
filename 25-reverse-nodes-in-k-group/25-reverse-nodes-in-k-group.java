// TC: O(N) SC: O(N)
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null) return head;
        int count = k;
        ListNode curr = head;
        while(curr != null && count != 0) {
            count--;
            curr = curr.next;
        }
        if(count > 0) return head;
        ListNode prev = reverseKGroup(curr, k);
        ListNode currHead = head;
        for(int i = 0; i < k; i++) {
            ListNode next = currHead.next;
            currHead.next = prev;
            prev = currHead;
            currHead = next;
        }
        return prev;
    }
}