/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    let ans = [];
    for(let i = 0; i < nums.length; i++) {
        ans[i] = nums[i]**2;
    }
    return ans.sort((a, b) => a - b);
};