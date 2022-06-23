class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    public void quickSort(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }
    
    public int partition(int[] nums, int start, int end) {
        swap(nums, start, start + (end - start) / 2);
        int base = nums[start];
        int i = start + 1;
        int j = i;
        while(i <= end) {
            if(nums[i] < base) {
                swap(nums, i, j++);
            }
            i++;
        }
        swap(nums, j - 1, start);
        return j - 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}