class Solution {
    public int findMin(int[] nums) {
        
        int min=nums[0];
        int low=0,high=nums.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(nums[mid]<min)
                min=nums[mid];
            
            if(nums[mid]<nums[high])
                high=mid-1;
            else
                low=mid+1;
        }
        return min;
    }
}