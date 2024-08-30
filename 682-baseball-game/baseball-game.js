/**
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function(operations) {
    let ans = [];
    for(let i = 0; i < operations.length; i++) {
        if(operations[i] === 'C') {
            ans.pop();
        } else if(operations[i] === 'D') {
            let val = ans[ans.length - 1];
            ans.push(val * 2);
        } else if(operations[i] === '+') {
            let lastVal = ans[ans.length - 1];
            let secLastVal = ans[ans.length - 2];
            ans.push(lastVal + secLastVal);
        } else {
            ans.push(Number(operations[i]));
        }
    }
    return ans.reduce((acc, curr) => acc + curr, 0); 
};