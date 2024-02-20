/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let totalSum = 0;
    let sum = 0;

    for(let i = 0; i <= nums.length - 1; i++) {
        sum += nums[i];
    }

    for(let i = 1; i <= nums.length; i++) {
        totalSum += i;
    }
    return totalSum - sum;
};