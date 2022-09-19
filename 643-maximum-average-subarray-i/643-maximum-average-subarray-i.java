class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        } 
        double windowsum=sum;
        for(int i=k;i<n;i++){
            windowsum+=nums[i]-nums[i-k];
            sum=Math.max(windowsum,sum);
        }
        double avg=sum/k;
        return avg;
    }
}