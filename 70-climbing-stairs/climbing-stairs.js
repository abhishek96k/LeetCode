/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {
    if (n <= 3) {
        return n;
    }

    let prev1 = 3;
    let prev2 = 2;
    let curr = 0;

    for (let i = 3; i < n; i++) {
        curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    return curr;
};