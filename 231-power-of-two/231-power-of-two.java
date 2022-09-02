class Solution {
    public boolean isPowerOfTwo(int n) {
        double x=Math.log10(n)/Math.log10(2);
        if(x-(int)x==0){
        return true;
        }
        return false;
    }
}