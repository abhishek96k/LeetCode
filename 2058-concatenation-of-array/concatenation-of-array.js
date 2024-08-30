/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function (nums) {
    const ans = [];
    let count = 2;
    while (count !== 0) {
        for (let i = 0; i < nums.length; i++) {
            ans.push(nums[i]);
        }
        count--;
    }
    return ans;
};