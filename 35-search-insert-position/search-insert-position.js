/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let low = 0;
    let high = nums.length - 1;

    while(low <= high) {
        let mid = Math.floor((low + high) / 2);
        let midVal = nums[mid];
        if(target === midVal) {
            return mid;
        } else if(target > midVal) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low;
};