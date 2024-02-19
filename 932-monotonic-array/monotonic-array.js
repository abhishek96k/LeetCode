/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isMonotonic = function (nums) {
    let left = nums[0];
    let right = nums[nums.length - 1];

    if (left === right) {
        for (let i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] !== nums[i]) return false;
        }
    }
    else if (left < right) {
        for (let i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) return false;
        }
    } else {
        for (let i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) return false;
        }
    }
    return true;
};