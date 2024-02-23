/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    const hashTable = {};
    let needed;
    for (let i = 0; i < nums.length; i++) {
        needed = target - nums[i];
        if (needed in hashTable) {
            return [i, hashTable[needed]];
        } else {
            hashTable[nums[i]] = i;
        }
    }
};