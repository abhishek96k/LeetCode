function removeElement(nums: number[], val: number): number {
    let temp = 0;
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] !== val) {
            nums[temp] = nums[i];
            temp++;
        }
    }
    return temp;
};