class Solution {
    public int lengthOfLongestSubstring(String s) {
       if (s.length() == 0) return 0;
        int[] buckets = new int[95];
        int bestLength = 0, hi = 0, lo = 0;
        while (hi < s.length()) {
            char ch = s.charAt(hi++);
            buckets[ch - ' ']++;
            while (buckets[ch - ' '] > 1)
                buckets[s.charAt(lo++) - ' ']--;
            bestLength = Math.max(bestLength, hi - lo);
        }
        return bestLength;
    }
}