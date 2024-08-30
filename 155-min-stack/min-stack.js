
var MinStack = function () {
    this.stack = [];
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function (val) {
    let minVal = this.getMin();
    if (minVal === null || minVal > val) {
        minVal = val;
    }
    this.stack.push([val, minVal]);
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function () {
    this.stack.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function () {
    return this.stack.length ? this.stack[this.stack.length - 1][0] : null;
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function () {
    return this.stack.length ? this.stack[this.stack.length - 1][1] : null;
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */