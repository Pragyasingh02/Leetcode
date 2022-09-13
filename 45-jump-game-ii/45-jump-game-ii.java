class Solution {
    public int jump(int[] nums) {
        int n= nums.length;
        int[] p=new int[n];
        Arrays.fill(p,Integer.MAX_VALUE);
        p[n-1]=0;
        int step=0;
        for(int i=n-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
                min=Math.min(min,p[j]);
            }
            if(min!=Integer.MAX_VALUE){
                p[i]=min+1;
            }
        }
        return p[0];
    }
}