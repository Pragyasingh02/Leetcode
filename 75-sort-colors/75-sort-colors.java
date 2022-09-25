class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid =0;
        int high = n-1;
        while(mid<=high)
        {
           if(nums[mid]==0){
            swap(nums,low,mid);
            low++;
            mid++;
             }
          else if(nums[mid]==1){
           mid++;
             }
          else
           {
           swap(nums,mid,high);
           high--;
         }
       }
   }
    private void swap(int a[],int b,int c){
       int temp = a[b];
       a[b] = a[c];
       a[c] = temp;
    }
}