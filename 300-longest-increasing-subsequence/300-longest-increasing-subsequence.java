class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int[] dp=new int[n];
        dp[0]=1;
       int ans=1;
        for(int i=1;i<dp.length;i++){
             int max=0; 
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                  max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}