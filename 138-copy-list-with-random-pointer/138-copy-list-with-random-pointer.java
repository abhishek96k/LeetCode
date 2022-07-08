
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Node curr = head;
        while(curr != null) {
            Node next = curr.next;
            curr.next = new Node(curr.val, next, null);
            curr = next;
        }
        
        curr = head;
        while(curr != null) {
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        
        curr = head;
        Node copyHead = head.next;
        while(curr != null) {
            Node next = curr.next.next;
            
            Node copy = curr.next;
            curr.next = next;
            
            if(next != null)
                copy.next = next.next;
            curr = next;
        }
        return copyHead;
    }
}