/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
    let sum = nums.length;
    for (let i = 0; i < nums.length; i++) {
        sum += i - nums[i];
    }
    return sum;
};