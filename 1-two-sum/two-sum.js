/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    const ans = {};
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        let want = target - num;
        if (want in ans) {
            const left = ans[want];
            return [left, i];
        } else {
            ans[num] = i;
        }
    }
};