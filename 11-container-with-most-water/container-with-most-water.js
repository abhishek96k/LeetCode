/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    let left = 0;
    let right = height.length - 1;
    let res = 0;
    while (left < right) {
        let minValue = Math.min(height[left], height[right]);
        res = Math.max(res, minValue * (right - left));
        if (minValue === height[left]) {
            left++;
        }
        else {
            console.log("right", right);
            right--;
        }
    }
    return res;
};