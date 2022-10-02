class Solution {
    
    public int firstElement(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        // int idx = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                if(mid == 0 || nums[mid] != nums[mid - 1])
                    return mid;
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public int lastElement(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        // int idx = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > target){
                high = mid - 1;
            } 
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                if(mid == nums.length - 1 || nums[mid] != nums[mid + 1])
                    return mid;
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = firstElement(nums, target);
        res[1] = lastElement(nums, target);
        return res;
    }
}