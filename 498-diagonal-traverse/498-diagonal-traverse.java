class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n= mat.length;
        int n1=mat[0].length;
        int k=0;
        int [] ans = new int[n*n1];
        for(int d=0;d<n+n1-1;d++){
            int r,c=0;
            if(d<n1){
                r=0;
                c=d;
            }
            else{
                c=n1-1;
                r=d-n1+1;
            }
         ArrayList<Integer> list=new ArrayList<>();  
            while(r<n && c>=0 ){
                list.add(mat[r][c]);
                r++;
                c--;   
            }
            if(d%2==0){
                for(int i=list.size()-1;i>=0;i--){
                    ans[k]=list.get(i);
                    k++;
                }
            }
            else{
                for(int i=0;i<list.size();i++){
                    ans[k]=list.get(i);
                    k++;
                }
            }
        }
        return ans;
    }
}