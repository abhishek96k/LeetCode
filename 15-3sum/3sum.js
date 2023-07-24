/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
     const output = [];
     nums.sort((a, b) => a - b);
     for(let i = 0; i < nums.length - 2; i++) {
         let left = i + 1;
         let right = nums.length - 1;
         if(i > 0 && nums[i] === nums[i-1]) continue;
         while(left < right) {
             let total = nums[i] + nums[left] + nums[right];
             if(total === 0) {
                 output.push([nums[i], nums[left], nums[right]]);
                 while(left < right && nums[right - 1] === nums[right]){
                     right--;
                 }
                 while(left < right && nums[left + 1] === nums[left]){
                     left++;
                 }
                 right--;
                 left++;
             } else if (total > 0) {
                 right--;
             } else {
                 left++;
             }
         }
     }
     return output;
};