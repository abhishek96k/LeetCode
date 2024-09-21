/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function (nums) {
    if (nums.length <= 1) return nums;

    const midPoint = Math.floor(nums.length / 2);
    const left = nums.slice(0, midPoint);
    const right = nums.slice(midPoint);

    const sortedLeft = sortArray(left);
    const sortedRight = sortArray(right);

    return merge(sortedLeft, sortedRight);
};

function merge(left, right) {
    const sortedResult = [];
    let l = 0, r = 0;

    while (l < left.length && r < right.length) {
        if (left[l] < right[r]) {
            sortedResult.push(left[l]);
            l++;
        } else {
            sortedResult.push(right[r]);
            r++;
        }
    }
    sortedResult.push(...left.slice(l), ...right.slice(r));
    return sortedResult;
}