class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap <Integer,Integer> numi= new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++){
          if(numi.containsKey(nums[i])){
              if(i-numi.get(nums[i])<=k){
                  return true;
              }
          }
          numi.put(nums[i],i);
      }
        return false;
    }
}