class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{startingPoint(nums, target), endingPoint(nums, target)};
    }
    public int startingPoint(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                if(mid == 0 || nums[mid - 1] != target){
                    return mid;
                }
                else
                    high = mid - 1;
            }
            else if (nums[mid] > target){
                high = mid -1;
            }
            else
                low = mid +1;
        }
        return -1;
    }
    
    public int endingPoint(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                if(mid == nums.length -1 || nums[mid + 1] != target){
                    return mid;
                }
                else
                    low = mid + 1;
            }
            else if (nums[mid] > target){
                high = mid -1;
            }
            else
                low = mid +1;
        }
        return -1;
    }
}