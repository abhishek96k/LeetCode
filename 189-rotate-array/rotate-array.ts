/**
 Do not return anything, modify nums in-place instead.
 */
function rotate(nums: number[], k: number): void {
    k = k % nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
};

function reverse(nums: number[], left: number, right: number): number[] {
    while(left < right) {
        [nums[left], nums[right]] = [nums[right], nums[left]];
        left++;
        right--;
    }
    return nums;
}