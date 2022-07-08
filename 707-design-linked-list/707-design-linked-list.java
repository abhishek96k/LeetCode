class MyLinkedList {
    
    private int size;
    private Node head, tail;
    
    private class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public MyLinkedList() {
        size = 0;
        head = tail = null;
    }
    
    private Node getNode(int index) {
        Node p = head;
        for(int i = 0; i < index; ++i) p = p.next;
        return p;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        return getNode(index).val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val, head);
        if(size == 0) head = tail = node;
        else head = node;
        ++size;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(size == 0) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        ++size;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0) addAtHead(val);
        else if(index == size) addAtTail(val);
        else{
            Node p = getNode(index - 1);
            Node node = new Node(val, p.next);
            p.next = node;
            ++size;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if(size == 1) {
            head = tail = null; 
        }
        else if(index == 0){
            head = head.next;
        }
        else {
            Node p = getNode(index - 1);
            p.next = p.next.next;
            if(index == size - 1) tail = p;
        }
        --size;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */