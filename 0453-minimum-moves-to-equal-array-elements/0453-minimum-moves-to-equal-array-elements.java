class Solution {
    public int minMoves(int[] nums) {
        
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(Math.abs(nums[0]-nums[i]));
        }
        return sum;
        
    
    }
}