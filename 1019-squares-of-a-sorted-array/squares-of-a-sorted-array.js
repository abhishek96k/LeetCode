/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    const ans = new Array(nums.length).fill(0);
    let left = 0;
    let right = nums.length - 1;
    
    for(let i = nums.length - 1; i >= 0; i--) {
        const leftSquare = Math.pow(nums[left], 2);
        const rightSquare = Math.pow(nums[right], 2);
        if(leftSquare > rightSquare) {
            ans[i] = leftSquare;
            left++; 
        } else {
            ans[i] = rightSquare;
            right--;
        }
    }
    return ans;
};