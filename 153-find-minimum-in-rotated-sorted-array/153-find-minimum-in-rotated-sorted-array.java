class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n==1)  
            return nums[0];
        int min=nums[0];
        for(int i=1;i<n;i++)
       {
         if(nums[i]<min) 
             min=nums[i];
       }
    return min;
    }
}