/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function (nums) {
    if (nums.length <= 1) return nums;

    let midPoint = Math.floor(nums.length / 2);
    let left = nums.slice(0, midPoint);
    let right = nums.slice(midPoint);

    let sortedLeft = sortArray(left);
    let sortedRight = sortArray(right);

    return merge(sortedLeft, sortedRight);
};

function merge(left, right) {
    const result = [];
    let l = 0, r = 0;

    while (l < left.length && r < right.length) {
        if (left[l] < right[r]) {
            result.push(left[l]);
            l++;
        } else {
            result.push(right[r]);
            r++;
        }
    }

    result.push(...left.slice(l), ...right.slice(r));
    return result;
}