class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int c=0;
        int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            a[c++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            a[c++]=nums2[i];
        }
        Arrays.sort(a);
        int m=a.length;
        if(m%2!=0)
        {
            return a[m/2];
        }
        else
            return (double)(a[m/2]+a[m/2-1])/2;
    }
}