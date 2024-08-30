class ListNode {
    constructor(val, next) {
        this.val = val == undefined ? 0 : val;
        this.next = next == undefined ? null : next;
    }
}

var MyLinkedList = function () {
    this.head = null;
};

/** 
 * @param {number} index
 * @return {number}
 */
MyLinkedList.prototype.get = function (index) {
    if (index < 0 || index >= this.getLength())
        return -1;
    let curr = this.head;
    for (let i = 0; i < index; i++) {
        curr = curr.next;
    }
    return curr.val;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtHead = function (val) {
    let node = new ListNode(val);
    node.next = this.head;
    this.head = node;
};

/** 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtTail = function (val) {
    if (this.head == null) {
        this.addAtHead(val);
        return;
    }
    let node = new ListNode(val);
    let curr = this.head;
    while (curr.next !== null) {
        curr = curr.next;
    }
    curr.next = node;
};

/** 
 * @param {number} index 
 * @param {number} val
 * @return {void}
 */
MyLinkedList.prototype.addAtIndex = function (index, val) {
    if (index === 0) {
        this.addAtHead(val);
        return;
    }

    if (index === this.getLength()) {
        this.addAtTail(val);
        return;
    }

    if (index > this.getLength()) return;

    let curr = this.head;
    let node = new ListNode(val);
    for (let i = 0; i < index - 1; i++) {
        curr = curr.next;
    }
    let next = curr.next;
    curr.next = node;
    node.next = next;
};

/** 
 * @param {number} index
 * @return {void}
 */
MyLinkedList.prototype.deleteAtIndex = function (index) {
    if (index < 0 || index >= this.getLength()) return;
    if (index == 0) {
        this.head = this.head.next;
        return;
    }

    let curr = this.head;
    for (let i = 0; i < index - 1; i++) {
        curr = curr.next;
    }
    curr.next = curr.next.next;
};

MyLinkedList.prototype.getLength = function () {
    let len = 0;
    let curr = this.head;

    while (curr !== null) {
        curr = curr.next;
        len++;
    }
    return len;
}

/** 
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(val)
 * obj.addAtTail(val)
 * obj.addAtIndex(index,val)
 * obj.deleteAtIndex(index)
 */