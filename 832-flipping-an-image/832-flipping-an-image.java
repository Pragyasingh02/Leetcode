class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       
        for(int i=0;i<image.length;i++)
        {
            
            int[] arr=image[i];
            for(int j=0;j<arr.length/2;j++)
            {
                int tmp=arr[j];
                arr[j]=arr[arr.length-1-j];
                arr[arr.length-1-j]=tmp;
            }
            
            
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==0)
                {
                    arr[j]=1;
                }
                else
                {
                   arr[j]=0; 
                }
            }
            image[i]=arr;
        }
        return image;
    }
}